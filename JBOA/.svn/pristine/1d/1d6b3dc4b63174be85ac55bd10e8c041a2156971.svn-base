package cn.jboa.dao;

import cn.jboa.util.PaginationSupport;
import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.dao.DataAccessException;

public abstract interface BaseDao<T>
{
  public abstract void saveOrUpdate(T paramT);

  public abstract void delete(T paramT);

  public abstract T get(Serializable paramSerializable);

  public abstract T save(T paramT)
    throws DataAccessException;

  public abstract T update(T paramT)
    throws DataAccessException;

  public abstract List<T> query(DetachedCriteria paramDetachedCriteria, int paramInt1, int paramInt2)
    throws DataAccessException;

  public abstract PaginationSupport<T> findPageByCriteria(DetachedCriteria paramDetachedCriteria, int paramInt1, int paramInt2);

  public abstract List find(String paramString)
    throws DataAccessException;

  public abstract List find(String paramString, Object paramObject)
    throws DataAccessException;

  public abstract List find(String paramString, Object[] paramArrayOfObject)
    throws DataAccessException;

  public abstract Object findFirst(String paramString)
    throws DataAccessException;

  public abstract Object findFirst(String paramString, Object paramObject)
    throws DataAccessException;

  public abstract Object findFirst(String paramString, Object[] paramArrayOfObject)
    throws DataAccessException;
}