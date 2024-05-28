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
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterLiveContestListBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvContestPoints;

  @NonNull
  public final TextView tvContestPointsHead;

  @NonNull
  public final TextView tvContestRank;

  @NonNull
  public final TextView tvContestRankHead;

  @NonNull
  public final TextView tvLiveContestDesc;

  @NonNull
  public final TextView tvLiveContestFees;

  @NonNull
  public final TextView tvLiveContestName;

  @NonNull
  public final TextView tvLiveEntryFeesHead;

  @NonNull
  public final TextView tvLiveJoinedWith;

  @NonNull
  public final TextView tvLiveJoinedWithHead;

  @NonNull
  public final TextView tvViewLeaderboard;

  @NonNull
  public final TextView tvWinningAmount;

  protected AdapterLiveContestListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView tvContestPoints, TextView tvContestPointsHead,
      TextView tvContestRank, TextView tvContestRankHead, TextView tvLiveContestDesc,
      TextView tvLiveContestFees, TextView tvLiveContestName, TextView tvLiveEntryFeesHead,
      TextView tvLiveJoinedWith, TextView tvLiveJoinedWithHead, TextView tvViewLeaderboard,
      TextView tvWinningAmount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvContestPoints = tvContestPoints;
    this.tvContestPointsHead = tvContestPointsHead;
    this.tvContestRank = tvContestRank;
    this.tvContestRankHead = tvContestRankHead;
    this.tvLiveContestDesc = tvLiveContestDesc;
    this.tvLiveContestFees = tvLiveContestFees;
    this.tvLiveContestName = tvLiveContestName;
    this.tvLiveEntryFeesHead = tvLiveEntryFeesHead;
    this.tvLiveJoinedWith = tvLiveJoinedWith;
    this.tvLiveJoinedWithHead = tvLiveJoinedWithHead;
    this.tvViewLeaderboard = tvViewLeaderboard;
    this.tvWinningAmount = tvWinningAmount;
  }

  @NonNull
  public static AdapterLiveContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_live_contest_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterLiveContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterLiveContestListBinding>inflateInternal(inflater, R.layout.adapter_live_contest_list, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterLiveContestListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_live_contest_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterLiveContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterLiveContestListBinding>inflateInternal(inflater, R.layout.adapter_live_contest_list, null, false, component);
  }

  public static AdapterLiveContestListBinding bind(@NonNull View view) {
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
  public static AdapterLiveContestListBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterLiveContestListBinding)bind(component, view, R.layout.adapter_live_contest_list);
  }
}
