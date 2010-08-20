/**
 *
 * Copyright (C) 2010 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.jclouds.io.payloads;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.google.common.base.Throwables;

/**
 * @author Adrian Cole
 */
public class FilePayload extends BasePayload<File> {

   public FilePayload(File content) {
      super(content, null, content.length(), null);
      checkArgument(checkNotNull(content, "content").exists(), "file must exist: " + content);
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public InputStream getInput() {
      try {
         return new FileInputStream(content);
      } catch (FileNotFoundException e) {
         Throwables.propagate(e);
         return null;
      }
   }

}