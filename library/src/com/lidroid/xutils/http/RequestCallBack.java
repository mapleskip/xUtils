/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lidroid.xutils.http;


import com.lidroid.xutils.exception.HttpException;

public abstract class RequestCallBack<T> {

    private int rate = 1000 * 1;

    public int getRate() {
        return rate;
    }

    public void onStart() {
    }

    public void onLoading(long total, long current, boolean isUploading) {
    }

    public abstract void onSuccess(T result);

    public void onFailure(HttpException error, String msg) {
    }
}
