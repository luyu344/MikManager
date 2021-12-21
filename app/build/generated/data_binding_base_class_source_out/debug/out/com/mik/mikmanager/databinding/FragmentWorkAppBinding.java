// Generated by view binder compiler. Do not edit!
package com.mik.mikmanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.mik.mikmanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWorkAppBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final Button btnSelectPackage;

  @NonNull
  public final EditText txtAppName;

  @NonNull
  public final EditText txtPackageName;

  private FragmentWorkAppBinding(@NonNull FrameLayout rootView, @NonNull Button btnSave,
      @NonNull Button btnSelectPackage, @NonNull EditText txtAppName,
      @NonNull EditText txtPackageName) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.btnSelectPackage = btnSelectPackage;
    this.txtAppName = txtAppName;
    this.txtPackageName = txtPackageName;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWorkAppBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWorkAppBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_work_app, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWorkAppBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSave;
      Button btnSave = rootView.findViewById(id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.btnSelectPackage;
      Button btnSelectPackage = rootView.findViewById(id);
      if (btnSelectPackage == null) {
        break missingId;
      }

      id = R.id.txtAppName;
      EditText txtAppName = rootView.findViewById(id);
      if (txtAppName == null) {
        break missingId;
      }

      id = R.id.txtPackageName;
      EditText txtPackageName = rootView.findViewById(id);
      if (txtPackageName == null) {
        break missingId;
      }

      return new FragmentWorkAppBinding((FrameLayout) rootView, btnSave, btnSelectPackage,
          txtAppName, txtPackageName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}