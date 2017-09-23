package cn.jboa.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 *职位
 *
 */
public class Position implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8458820234425747054L;
	private Integer id;
    private String nameCn;
    private String nameEn;

    /** default constructor */
    public Position() {
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCn() {
        return this.nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}