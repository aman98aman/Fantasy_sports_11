// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterNotificationListBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout RLTransMain;

  @NonNull
  public final TextView tvNotificationContest;

  @NonNull
  public final TextView tvNotificationTitle;

  protected AdapterNotificationListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout RLTransMain, TextView tvNotificationContest,
      TextView tvNotificationTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RLTransMain = RLTransMain;
    this.tvNotificationContest = tvNotificationContest;
    this.tvNotificationTitle = tvNotificationTitle;
  }

  @NonNull
  public static AdapterNotificationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_notification_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterNotificationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterNotificationListBinding>inflateInternal(inflater, R.layout.adapter_notification_list, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterNotificationListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_notification_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterNotificationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterNotificationListBinding>inflateInternal(inflater, R.layout.adapter_notification_list, null, false, component);
  }

  public static AdapterNotificationListBinding bind(@NonNull View view) {
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
  public static AdapterNotificationListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterNotificationListBinding)bind(component, view, R.layout.adapter_notification_list);
  }
}
