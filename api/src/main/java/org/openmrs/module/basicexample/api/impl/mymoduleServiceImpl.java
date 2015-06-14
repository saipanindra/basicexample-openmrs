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
package org.openmrs.module.basicexample.api.impl;

import java.util.List;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.basicexample.mymodule;
import org.openmrs.module.basicexample.api.mymoduleService;
import org.openmrs.module.basicexample.api.db.mymoduleDAO;

/**
 * It is a default implementation of {@link mymoduleService}.
 */
public class mymoduleServiceImpl extends BaseOpenmrsService implements mymoduleService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private mymoduleDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(mymoduleDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public mymoduleDAO getDao() {
	    return dao;
    }

	@Override
	public List<mymodule> getAllMyEntries() {
		// TODO Auto-generated method stub
		return dao.getAllMyEntries();
		}

	@Override
	public mymodule getMyEntry(Integer id) {
		// TODO Auto-generated method stub
		return dao.getMyEntry(id);
	}

	@Override
	public mymodule saveMyEntry(mymodule myentry) {
		// TODO Auto-generated method stub
		return dao.saveMyEntry(myentry);
	}

	@Override
	public void purgeMyEntry(mymodule myentry) {
		// TODO Auto-generated method stub
		dao.purgeMyEntry(myentry);
	}
}