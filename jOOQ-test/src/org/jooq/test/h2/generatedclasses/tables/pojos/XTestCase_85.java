/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_85 {

	private static final long serialVersionUID = 1219042575;

	private java.lang.Integer id;
	private java.lang.Integer xUnusedId;
	private java.lang.String  xUnusedName;

	public XTestCase_85() {}

	public XTestCase_85(
		java.lang.Integer id,
		java.lang.Integer xUnusedId,
		java.lang.String  xUnusedName
	) {
		this.id = id;
		this.xUnusedId = xUnusedId;
		this.xUnusedName = xUnusedName;
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
	public java.lang.Integer getXUnusedId() {
		return this.xUnusedId;
	}

	@Override
	public void setXUnusedId(java.lang.Integer xUnusedId) {
		this.xUnusedId = xUnusedId;
	}

	@Override
	public java.lang.String getXUnusedName() {
		return this.xUnusedName;
	}

	@Override
	public void setXUnusedName(java.lang.String xUnusedName) {
		this.xUnusedName = xUnusedName;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_85 from) {
		setId(from.getId());
		setXUnusedId(from.getXUnusedId());
		setXUnusedName(from.getXUnusedName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_85> E into(E into) {
		into.from(this);
		return into;
	}
}