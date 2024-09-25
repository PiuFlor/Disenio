package Disenio;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DAOAbstracto<T, ID> implements DAOGenerico<T, ID> {

	protected EntityManager entityManager;  // Usar un EntityManager para gestionar las operaciones

    public DAOAbstracto(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T findById(ID i) {
        return entityManager.find(getEntityClass(), i);
    }

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("FROM " + getEntityClass().getSimpleName(), getEntityClass())
                            .getResultList();
    }

    @Override
    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

    // Método abstracto que las subclases deben implementar para devolver la clase de la entidad específica
    public abstract Class<T> getEntityClass();
}
