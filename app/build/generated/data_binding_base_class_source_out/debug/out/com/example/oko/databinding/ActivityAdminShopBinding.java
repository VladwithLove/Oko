// Generated by view binder compiler. Do not edit!
package com.example.oko.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.oko.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminShopBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addProduct;

  @NonNull
  public final RecyclerView adminShopRecycle;

  @NonNull
  public final SearchView seachView;

  private ActivityAdminShopBinding(@NonNull LinearLayout rootView, @NonNull Button addProduct,
      @NonNull RecyclerView adminShopRecycle, @NonNull SearchView seachView) {
    this.rootView = rootView;
    this.addProduct = addProduct;
    this.adminShopRecycle = adminShopRecycle;
    this.seachView = seachView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminShopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_shop, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminShopBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addProduct;
      Button addProduct = ViewBindings.findChildViewById(rootView, id);
      if (addProduct == null) {
        break missingId;
      }

      id = R.id.adminShopRecycle;
      RecyclerView adminShopRecycle = ViewBindings.findChildViewById(rootView, id);
      if (adminShopRecycle == null) {
        break missingId;
      }

      id = R.id.seachView;
      SearchView seachView = ViewBindings.findChildViewById(rootView, id);
      if (seachView == null) {
        break missingId;
      }

      return new ActivityAdminShopBinding((LinearLayout) rootView, addProduct, adminShopRecycle,
          seachView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
