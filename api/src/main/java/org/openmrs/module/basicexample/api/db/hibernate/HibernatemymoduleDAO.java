/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.basicexample.api.db.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.module.basicexample.mymodule;
import org.openmrs.module.basicexample.api.db.mymoduleDAO;

/**
 * It is a default implementation of  {@link mymoduleDAO}.
 */
public class HibernatemymoduleDAO implements mymoduleDAO {
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
    }
    
	/**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
	    return sessionFactory;
    }

	@Override
	public List<mymodule> getAllMyEntries() {
		// TODO Auto-generated method stub
		return
				sessionFactory.getCurrentSession().createCriteria(mymodule.class).list();
	}

	@Override
	public mymodule getMyEntry(Integer id) {
		// TODO Auto-generated method stub
		return (mymodule)
				sessionFactory.getCurrentSession().get(mymodule.class, id);
	}

	@Override
	public mymodule saveMyEntry(mymodule myEntry) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(myEntry);
		return myEntry;
	}

	@Override
	public void purgeMyEntry(mymodule myEntry) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(myEntry);
		
	}
}