// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSeriesPlayerBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLPlayerInfo;

  protected ItemSeriesPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLPlayerInfo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLPlayerInfo = LLPlayerInfo;
  }

  @NonNull
  public static ItemSeriesPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_series_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeriesPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSeriesPlayerBinding>inflateInternal(inflater, R.layout.item_series_player, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSeriesPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_series_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeriesPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSeriesPlayerBinding>inflateInternal(inflater, R.layout.item_series_player, null, false, component);
  }

  public static ItemSeriesPlayerBinding bind(@NonNull View view) {
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
  public static ItemSeriesPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSeriesPlayerBinding)bind(component, view, R.layout.item_series_player);
  }
}
