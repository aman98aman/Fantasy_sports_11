// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterJoinMyTeamBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLMyTeamClone;

  @NonNull
  public final LinearLayout LLMyTeamEdit;

  @NonNull
  public final LinearLayout LLMyTeamPreview;

  @NonNull
  public final TextView tvJoinContestTeam;

  @NonNull
  public final TextView tvMyARCount;

  @NonNull
  public final TextView tvMyBATCount;

  @NonNull
  public final TextView tvMyBOWLCount;

  @NonNull
  public final TextView tvMyTeamCaptain;

  @NonNull
  public final TextView tvMyTeamName;

  @NonNull
  public final TextView tvMyTeamViceCaptain;

  @NonNull
  public final TextView tvMyWKCount;

  protected AdapterJoinMyTeamBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLMyTeamClone, LinearLayout LLMyTeamEdit, LinearLayout LLMyTeamPreview,
      TextView tvJoinContestTeam, TextView tvMyARCount, TextView tvMyBATCount,
      TextView tvMyBOWLCount, TextView tvMyTeamCaptain, TextView tvMyTeamName,
      TextView tvMyTeamViceCaptain, TextView tvMyWKCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLMyTeamClone = LLMyTeamClone;
    this.LLMyTeamEdit = LLMyTeamEdit;
    this.LLMyTeamPreview = LLMyTeamPreview;
    this.tvJoinContestTeam = tvJoinContestTeam;
    this.tvMyARCount = tvMyARCount;
    this.tvMyBATCount = tvMyBATCount;
    this.tvMyBOWLCount = tvMyBOWLCount;
    this.tvMyTeamCaptain = tvMyTeamCaptain;
    this.tvMyTeamName = tvMyTeamName;
    this.tvMyTeamViceCaptain = tvMyTeamViceCaptain;
    this.tvMyWKCount = tvMyWKCount;
  }

  @NonNull
  public static AdapterJoinMyTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_join_my_team, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterJoinMyTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterJoinMyTeamBinding>inflateInternal(inflater, R.layout.adapter_join_my_team, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterJoinMyTeamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_join_my_team, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterJoinMyTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterJoinMyTeamBinding>inflateInternal(inflater, R.layout.adapter_join_my_team, null, false, component);
  }

  public static AdapterJoinMyTeamBinding bind(@NonNull View view) {
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
  public static AdapterJoinMyTeamBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterJoinMyTeamBinding)bind(component, view, R.layout.adapter_join_my_team);
  }
}
