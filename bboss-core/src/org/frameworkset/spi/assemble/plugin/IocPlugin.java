/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.frameworkset.spi.assemble.plugin;

import org.frameworkset.spi.CallContext;

/**
 * <p>Title: IocPlugin.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2007</p>
 * @Date 2015-01-19 16:15
 * @author biaoping.yin
 * @version 1.0
 */
public interface IocPlugin<T,R> {
	/**
	 * 返回扩展ioc机制生成的对象实例
	 * @param object 输入的ioc元素对象,类型范围为：Pro,ProMap,ProList,ProArray,ProSet
	 * @param callcontext ioc依赖注入上下文，用来提供对循环依赖注入支持的
	 * @return
	 */
	public R ioc(T object, CallContext callcontext);

}
