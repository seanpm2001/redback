package org.codehaus.plexus.redback.users.ldap.ctl;

/*
 * Copyright 2001-2007 The Codehaus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Collection;
import java.util.List;

import javax.naming.directory.DirContext;

import org.codehaus.plexus.redback.common.ldap.LdapUser;
import org.codehaus.plexus.redback.common.ldap.MappingException;
import org.codehaus.plexus.redback.users.User;
import org.codehaus.plexus.redback.users.ldap.LdapUserQuery;

/**
 * @version $Id$
 */
public interface LdapController {

	public static final String ROLE = LdapController.class.getName();
	
	public abstract void removeUser(Object principal, DirContext context)
			throws LdapControllerException;

	public abstract void updateUser(User user, DirContext context)
			throws LdapControllerException, MappingException;

	public abstract boolean userExists(Object key, DirContext context)
			throws LdapControllerException;

	public abstract Collection<User> getUsers(DirContext context)
			throws LdapControllerException, MappingException;

	public abstract void createUser(User user, DirContext context,
			boolean encodePasswordIfChanged) throws LdapControllerException,
			MappingException;

	public abstract LdapUser getUser(Object key, DirContext context)
			throws LdapControllerException, MappingException;

    public abstract List<User> getUsersByQuery(LdapUserQuery query, DirContext context)
            throws LdapControllerException, MappingException;
}
