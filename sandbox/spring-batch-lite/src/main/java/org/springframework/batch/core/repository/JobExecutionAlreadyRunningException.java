/*
 * Copyright 2006-2007 the original author or authors.
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
package org.springframework.batch.core.repository;

import org.springframework.batch.core.JobExecutionException;

/**
 * @author Dave Syer
 *
 */
@SuppressWarnings("serial")
public class JobExecutionAlreadyRunningException extends JobExecutionException {

	/**
	 * @param msg the exception message.
	 */
	public JobExecutionAlreadyRunningException(String msg) {
		super(msg);
	}

	/**
	 * @param msg the exception message.
	 * @param cause the cause of the exception.
	 */
	public JobExecutionAlreadyRunningException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
