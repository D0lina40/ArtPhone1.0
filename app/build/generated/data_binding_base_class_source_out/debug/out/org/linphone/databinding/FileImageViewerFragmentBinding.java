// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.files.viewmodels.ImageFileViewModel;

public abstract class FileImageViewerFragmentBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView topBarFragment;

  @Bindable
  protected ImageFileViewModel mViewModel;

  protected FileImageViewerFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FragmentContainerView topBarFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.topBarFragment = topBarFragment;
  }

  public abstract void setViewModel(@Nullable ImageFileViewModel viewModel);

  @Nullable
  public ImageFileViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FileImageViewerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.file_image_viewer_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FileImageViewerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FileImageViewerFragmentBinding>inflateInternal(inflater, R.layout.file_image_viewer_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FileImageViewerFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.file_image_viewer_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FileImageViewerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FileImageViewerFragmentBinding>inflateInternal(inflater, R.layout.file_image_viewer_fragment, null, false, component);
  }

  public static FileImageViewerFragmentBinding bind(@NonNull View view) {
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
  public static FileImageViewerFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FileImageViewerFragmentBinding)bind(component, view, R.layout.file_image_viewer_fragment);
  }
}
