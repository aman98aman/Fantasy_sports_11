// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNotificationBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView RVNotification;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView tvNoDataAvailable;

  protected ActivityNotificationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView RVNotification, ActivityMainheaderBinding head,
      SwipeRefreshLayout swipeRefreshLayout, TextView tvNoDataAvailable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RVNotification = RVNotification;
    this.head = head;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.tvNoDataAvailable = tvNoDataAvailable;
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_notification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNotificationBinding>inflateInternal(inflater, R.layout.activity_notification, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_notification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNotificationBinding>inflateInternal(inflater, R.layout.activity_notification, null, false, component);
  }

  public static ActivityNotificationBinding bind(@NonNull View view) {
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
  public static ActivityNotificationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNotificationBinding)bind(component, view, R.layout.activity_notification);
  }
}
