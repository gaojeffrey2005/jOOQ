/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPk implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentityPk {

	private static final long serialVersionUID = -158679572;

	private java.lang.Integer id;
	private java.lang.Integer val;

	public TIdentityPk() {}

	public TIdentityPk(
		java.lang.Integer id,
		java.lang.Integer val
	) {
		this.id = id;
		this.val = val;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getVal() {
		return this.val;
	}

	@Override
	public void setVal(java.lang.Integer val) {
		this.val = val;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentityPk from) {
		setId(from.getId());
		setVal(from.getVal());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentityPk> E into(E into) {
		into.from(this);
		return into;
	}
}