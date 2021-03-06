/*
 * Copyright (C) 2018 Eton Otieno Oboch
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.edoubletech.journalapp.data.dao;

import com.edoubletech.journalapp.data.model.User;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public abstract class UserDao implements BaseDao<User> {

    @Query("SELECT * FROM user_table")
    public abstract User getUser();
}
