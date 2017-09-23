package cn.jboa.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * 部门实体类
 */
public class Department implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1049421823434377681L;
	private Integer id;
    private String name;
    private Set sysEmployees = new HashSet(0);

    /** default constructor */
    public Department() {
    }

    /** minimal constructor */
    public Department(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getSysEmployees() {
        return this.sysEmployees;
    }

    public void setSysEmployees(Set sysEmployees) {
        this.sysEmployees = sysEmployees;
    }

}