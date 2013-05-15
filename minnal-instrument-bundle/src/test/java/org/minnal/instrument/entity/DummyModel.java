/**
 * 
 */
package org.minnal.instrument.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author ganeshs
 *
 */
@Entity
public class DummyModel {

	private Long id;
	
	private String code;
	
	@OneToMany
	private Set<DummyModel> children;
	
	@OneToMany
	private List<DummyModel> siblings;
	
	@ManyToOne
	private DummyModel parent;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	public String readCode() {
		return code;
	}

	/**
	 * @return the children
	 */
	public Set<DummyModel> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Set<DummyModel> children) {
		this.children = children;
	}

	/**
	 * @return the parent
	 */
	public DummyModel getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(DummyModel parent) {
		this.parent = parent;
	}

	/**
	 * @return the siblings
	 */
	public List<DummyModel> getSiblings() {
		return siblings;
	}

	/**
	 * @param siblings the siblings to set
	 */
	public void setSiblings(List<DummyModel> siblings) {
		this.siblings = siblings;
	}
	
	public void dummyAction() {
	}
	
	public void dummyAction(String param1, Long param2) {
		
	}
}
