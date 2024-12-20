// Generated by view binder compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.linphone.R;

public final class VideoPlayButtonBinding implements ViewBinding {
  @NonNull
  private final ImageView rootView;

  private VideoPlayButtonBinding(@NonNull ImageView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public ImageView getRoot() {
    return rootView;
  }

  @NonNull
  public static VideoPlayButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VideoPlayButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.video_play_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VideoPlayButtonBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new VideoPlayButtonBinding((ImageView) rootView);
  }
}
