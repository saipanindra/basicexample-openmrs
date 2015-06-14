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
package org.openmrs.module.basicexample.api.db;

import java.util.List;

import org.openmrs.module.basicexample.mymodule;
import org.openmrs.module.basicexample.api.mymoduleService;

/**
 *  Database methods for {@link mymoduleService}.
 */
public interface mymoduleDAO {
	
	/*
	 * Add DAO methods here
	 */
	  /**
     * @see org.openmrs.module.basicexample.api.mymoduleService#getAllMyEntries()
     */
    List<mymodule> getAllMyEntries();
    /**
     * @see org.openmrs.module.basicexample.api.mymoduleService#getMyEntry(java.lang.Integer)
     */
    mymodule getMyEntry(Integer id);
    /**
     * @see org.openmrs.module.basicexample.api.mymoduleService#saveMyEntry(org.openmrs.module.basicexample.mymodule)
     */
    mymodule saveMyEntry(mymodule myEntry);
    /**
     * @see org.openmrs.module.basicexample.api.mymoduleService#purgeMyEntry(org.openmrs.module.basicexample.mymodule)
     */
    void purgeMyEntry(mymodule myEntry);
}