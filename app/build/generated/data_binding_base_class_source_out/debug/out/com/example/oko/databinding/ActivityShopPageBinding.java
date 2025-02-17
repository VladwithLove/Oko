// Generated by view binder compiler. Do not edit!
package com.example.oko.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.oko.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShopPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView categoryItem;

  @NonNull
  public final TextView itemDescription;

  @NonNull
  public final ImageView itemImage;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView shopDate;

  private ActivityShopPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView categoryItem, @NonNull TextView itemDescription,
      @NonNull ImageView itemImage, @NonNull TextView price, @NonNull TextView shopDate) {
    this.rootView = rootView;
    this.categoryItem = categoryItem;
    this.itemDescription = itemDescription;
    this.itemImage = itemImage;
    this.price = price;
    this.shopDate = shopDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShopPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShopPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_shop_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShopPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categoryItem;
      TextView categoryItem = ViewBindings.findChildViewById(rootView, id);
      if (categoryItem == null) {
        break missingId;
      }

      id = R.id.itemDescription;
      TextView itemDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemDescription == null) {
        break missingId;
      }

      id = R.id.itemImage;
      ImageView itemImage = ViewBindings.findChildViewById(rootView, id);
      if (itemImage == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.shopDate;
      TextView shopDate = ViewBindings.findChildViewById(rootView, id);
      if (shopDate == null) {
        break missingId;
      }

      return new ActivityShopPageBinding((ConstraintLayout) rootView, categoryItem, itemDescription,
          itemImage, price, shopDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
