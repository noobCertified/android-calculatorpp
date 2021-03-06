/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.calculator.history;

import javax.annotation.Nonnull;

import org.solovyev.android.calculator.CalculatorFragmentType;
import org.solovyev.android.calculator.Locator;
import org.solovyev.android.calculator.R;

import java.util.ArrayList;
import java.util.List;

/**
 * User: serso
 * Date: 12/18/11
 * Time: 7:40 PM
 */
public class CalculatorSavedHistoryFragment extends AbstractCalculatorHistoryFragment {

	public CalculatorSavedHistoryFragment() {
		super(CalculatorFragmentType.saved_history);
	}

	@Override
	protected int getItemLayoutId() {
		return R.layout.saved_history_item;
	}

	@Nonnull
	@Override
	protected List<CalculatorHistoryState> getHistoryItems() {
		return new ArrayList<CalculatorHistoryState>(Locator.getInstance().getHistory().getSavedHistory());
	}

	@Override
	protected void clearHistory() {
		Locator.getInstance().getHistory().clearSavedHistory();
		getAdapter().clear();
	}
}
