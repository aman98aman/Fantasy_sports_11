// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNewPasswordBinding extends ViewDataBinding {
  @NonNull
  public final EditText etConfirmNewPassword;

  @NonNull
  public final EditText etNewPassword;

  @NonNull
  public final EditText etOldPassword;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final TextInputLayout inputConfirmNewPassword;

  @NonNull
  public final TextInputLayout inputNewPassword;

  @NonNull
  public final TextInputLayout inputOldPassword;

  @NonNull
  public final TextView tvNewPasswordHead;

  @NonNull
  public final TextView tvSubmitNewPassword;

  protected ActivityNewPasswordBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etConfirmNewPassword, EditText etNewPassword, EditText etOldPassword,
      ActivityMainheaderBinding head, TextInputLayout inputConfirmNewPassword,
      TextInputLayout inputNewPassword, TextInputLayout inputOldPassword,
      TextView tvNewPasswordHead, TextView tvSubmitNewPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etConfirmNewPassword = etConfirmNewPassword;
    this.etNewPassword = etNewPassword;
    this.etOldPassword = etOldPassword;
    this.head = head;
    this.inputConfirmNewPassword = inputConfirmNewPassword;
    this.inputNewPassword = inputNewPassword;
    this.inputOldPassword = inputOldPassword;
    this.tvNewPasswordHead = tvNewPasswordHead;
    this.tvSubmitNewPassword = tvSubmitNewPassword;
  }

  @NonNull
  public static ActivityNewPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNewPasswordBinding>inflateInternal(inflater, R.layout.activity_new_password, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNewPasswordBinding>inflateInternal(inflater, R.layout.activity_new_password, null, false, component);
  }

  public static ActivityNewPasswordBinding bind(@NonNull View view) {
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
  public static ActivityNewPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNewPasswordBinding)bind(component, view, R.layout.activity_new_password);
  }
}
