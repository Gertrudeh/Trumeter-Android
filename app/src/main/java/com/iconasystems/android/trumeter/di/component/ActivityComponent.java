/*
 * Copyright (C) 2015 The Android Open Source Project
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
 *
 */

package com.iconasystems.android.trumeter.di.component;
import com.iconasystems.android.trumeter.di.scope.ActivityScope;
import com.iconasystems.android.trumeter.view.activity.BillingActivity;
import com.iconasystems.android.trumeter.view.activity.BillingPeriodsActivity;
import com.iconasystems.android.trumeter.view.activity.CustomersActivity;
import com.iconasystems.android.trumeter.view.activity.LoginActivity;
import com.iconasystems.android.trumeter.view.activity.RoutesActivity;
import com.iconasystems.android.trumeter.view.activity.SelectBillingPeriodActivity;
import com.iconasystems.android.trumeter.view.activity.TasksActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {

    void inject(TasksActivity tasksActivity);

    void inject(RoutesActivity routesActivity);

    void inject(BillingActivity billingActivity);

    void inject(CustomersActivity customersActivity);

    void inject(BillingPeriodsActivity billingPeriodsActivity);

    void inject(SelectBillingPeriodActivity selectBillingPeriodActivity);

    void inject(LoginActivity loginActivity);
}
