// Generated by data binding compiler. Do not edit!
package com.team.eleven.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.team.eleven.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMoreBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout RLFantasyPointSystem;

  @NonNull
  public final LinearLayout RLInviteFriends;

  @NonNull
  public final RelativeLayout RLMoreAboutUs;

  @NonNull
  public final RelativeLayout RLMoreHelpDesk;

  @NonNull
  public final RelativeLayout RLMoreHowToPlay;

  @NonNull
  public final RelativeLayout RLMoreInviteFriend;

  @NonNull
  public final RelativeLayout RLMoreLegality;

  @NonNull
  public final RelativeLayout RLMoreRefundPolicy;

  @NonNull
  public final RelativeLayout RLMoreWithdrawPolicy;

  @NonNull
  public final RelativeLayout RLPRICING;

  @NonNull
  public final ImageView imAboutUs;

  @NonNull
  public final ImageView imArrow1;

  @NonNull
  public final ImageView imArrow10;

  @NonNull
  public final ImageView imArrow2;

  @NonNull
  public final ImageView imArrow3;

  @NonNull
  public final ImageView imArrow4;

  @NonNull
  public final ImageView imArrow5;

  @NonNull
  public final ImageView imArrow6;

  @NonNull
  public final ImageView imArrow7;

  @NonNull
  public final ImageView imArrow8;

  @NonNull
  public final ImageView imArrow9;

  @NonNull
  public final ImageView imContestInvite;

  @NonNull
  public final ImageView imFPS;

  @NonNull
  public final ImageView imHelpDesk;

  @NonNull
  public final ImageView imHowToPlay;

  @NonNull
  public final ImageView imInviteFriends;

  @NonNull
  public final ImageView imLegality;

  @NonNull
  public final ImageView imPRICING;

  @NonNull
  public final ImageView imPS;

  @NonNull
  public final ImageView imRefund;

  @NonNull
  public final ImageView imWWU;

  @NonNull
  public final ImageView imWithdraw;

  @NonNull
  public final TextView tvAboutUs;

  @NonNull
  public final TextView tvFPS;

  @NonNull
  public final TextView tvHelpDesk;

  @NonNull
  public final TextView tvHowToPlay;

  @NonNull
  public final TextView tvInviteFriend;

  @NonNull
  public final TextView tvPRICING;

  @NonNull
  public final TextView tvTvContestInvite;

  @NonNull
  public final TextView tvWWU;

  protected FragmentMoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout RLFantasyPointSystem, LinearLayout RLInviteFriends,
      RelativeLayout RLMoreAboutUs, RelativeLayout RLMoreHelpDesk, RelativeLayout RLMoreHowToPlay,
      RelativeLayout RLMoreInviteFriend, RelativeLayout RLMoreLegality,
      RelativeLayout RLMoreRefundPolicy, RelativeLayout RLMoreWithdrawPolicy,
      RelativeLayout RLPRICING, ImageView imAboutUs, ImageView imArrow1, ImageView imArrow10,
      ImageView imArrow2, ImageView imArrow3, ImageView imArrow4, ImageView imArrow5,
      ImageView imArrow6, ImageView imArrow7, ImageView imArrow8, ImageView imArrow9,
      ImageView imContestInvite, ImageView imFPS, ImageView imHelpDesk, ImageView imHowToPlay,
      ImageView imInviteFriends, ImageView imLegality, ImageView imPRICING, ImageView imPS,
      ImageView imRefund, ImageView imWWU, ImageView imWithdraw, TextView tvAboutUs, TextView tvFPS,
      TextView tvHelpDesk, TextView tvHowToPlay, TextView tvInviteFriend, TextView tvPRICING,
      TextView tvTvContestInvite, TextView tvWWU) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RLFantasyPointSystem = RLFantasyPointSystem;
    this.RLInviteFriends = RLInviteFriends;
    this.RLMoreAboutUs = RLMoreAboutUs;
    this.RLMoreHelpDesk = RLMoreHelpDesk;
    this.RLMoreHowToPlay = RLMoreHowToPlay;
    this.RLMoreInviteFriend = RLMoreInviteFriend;
    this.RLMoreLegality = RLMoreLegality;
    this.RLMoreRefundPolicy = RLMoreRefundPolicy;
    this.RLMoreWithdrawPolicy = RLMoreWithdrawPolicy;
    this.RLPRICING = RLPRICING;
    this.imAboutUs = imAboutUs;
    this.imArrow1 = imArrow1;
    this.imArrow10 = imArrow10;
    this.imArrow2 = imArrow2;
    this.imArrow3 = imArrow3;
    this.imArrow4 = imArrow4;
    this.imArrow5 = imArrow5;
    this.imArrow6 = imArrow6;
    this.imArrow7 = imArrow7;
    this.imArrow8 = imArrow8;
    this.imArrow9 = imArrow9;
    this.imContestInvite = imContestInvite;
    this.imFPS = imFPS;
    this.imHelpDesk = imHelpDesk;
    this.imHowToPlay = imHowToPlay;
    this.imInviteFriends = imInviteFriends;
    this.imLegality = imLegality;
    this.imPRICING = imPRICING;
    this.imPS = imPS;
    this.imRefund = imRefund;
    this.imWWU = imWWU;
    this.imWithdraw = imWithdraw;
    this.tvAboutUs = tvAboutUs;
    this.tvFPS = tvFPS;
    this.tvHelpDesk = tvHelpDesk;
    this.tvHowToPlay = tvHowToPlay;
    this.tvInviteFriend = tvInviteFriend;
    this.tvPRICING = tvPRICING;
    this.tvTvContestInvite = tvTvContestInvite;
    this.tvWWU = tvWWU;
  }

  @NonNull
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_more, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMoreBinding>inflateInternal(inflater, R.layout.fragment_more, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_more, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMoreBinding>inflateInternal(inflater, R.layout.fragment_more, null, false, component);
  }

  public static FragmentMoreBinding bind(@NonNull View view) {
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
  public static FragmentMoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMoreBinding)bind(component, view, R.layout.fragment_more);
  }
}
