// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCreateContestBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout RL1;

  @NonNull
  public final RelativeLayout RL2;

  @NonNull
  public final RelativeLayout RLBottomCreateMyContest;

  @NonNull
  public final EditText etContestName;

  @NonNull
  public final EditText etContestSize;

  @NonNull
  public final EditText etWinningAmount;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final TextInputLayout inputContestName;

  @NonNull
  public final TextInputLayout inputContestSize;

  @NonNull
  public final TextInputLayout inputWinningAmount;

  @NonNull
  public final TextView tvCalculateEntryFees;

  @NonNull
  public final TextView tvCreateMyContest;

  @NonNull
  public final TextView tvEntryFees;

  protected ActivityCreateContestBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout RL1, RelativeLayout RL2, RelativeLayout RLBottomCreateMyContest,
      EditText etContestName, EditText etContestSize, EditText etWinningAmount,
      ActivityMainheaderBinding head, TextInputLayout inputContestName,
      TextInputLayout inputContestSize, TextInputLayout inputWinningAmount,
      TextView tvCalculateEntryFees, TextView tvCreateMyContest, TextView tvEntryFees) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RL1 = RL1;
    this.RL2 = RL2;
    this.RLBottomCreateMyContest = RLBottomCreateMyContest;
    this.etContestName = etContestName;
    this.etContestSize = etContestSize;
    this.etWinningAmount = etWinningAmount;
    this.head = head;
    this.inputContestName = inputContestName;
    this.inputContestSize = inputContestSize;
    this.inputWinningAmount = inputWinningAmount;
    this.tvCalculateEntryFees = tvCalculateEntryFees;
    this.tvCreateMyContest = tvCreateMyContest;
    this.tvEntryFees = tvEntryFees;
  }

  @NonNull
  public static ActivityCreateContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_create_contest, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCreateContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCreateContestBinding>inflateInternal(inflater, R.layout.activity_create_contest, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCreateContestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_create_contest, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCreateContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCreateContestBinding>inflateInternal(inflater, R.layout.activity_create_contest, null, false, component);
  }

  public static ActivityCreateContestBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCreateContestBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCreateContestBinding)bind(component, view, R.layout.activity_create_contest);
  }
}
