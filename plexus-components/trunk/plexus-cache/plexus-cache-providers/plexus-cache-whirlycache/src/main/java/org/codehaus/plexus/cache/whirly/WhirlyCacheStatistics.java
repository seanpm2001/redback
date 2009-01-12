package org.codehaus.plexus.cache.whirly;

import org.codehaus.plexus.cache.CacheStatistics;
import org.codehaus.plexus.cache.AbstractCacheStatistics;

import com.whirlycott.cache.Cache;

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

/**
 * @since 3 f�vr. 07
 * @version $Id$
 * @author <a href="mailto:olamy@codehaus.org">Olivier Lamy</a>
 */
public class WhirlyCacheStatistics
    extends AbstractCacheStatistics
    implements CacheStatistics
{

    private Cache cache;

    protected WhirlyCacheStatistics( Cache cache )
    {
        super();
        this.cache = cache;
    }

    /** 
     * @see org.codehaus.plexus.cache.AbstractCacheStatistics#getSize()
     */
    public long getSize()
    {
        return this.cache.size();
    }

}
