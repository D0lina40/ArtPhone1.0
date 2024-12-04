package org.linphone.activities.assistant.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/assistant/fragments/CountryPickerFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lorg/linphone/databinding/AssistantCountryPickerFragmentBinding;", "adapter", "Lorg/linphone/activities/assistant/adapters/CountryPickerAdapter;", "binding", "getBinding", "()Lorg/linphone/databinding/AssistantCountryPickerFragmentBinding;", "listener", "Lorg/linphone/activities/assistant/fragments/CountryPickerFragment$CountryPickedListener;", "getListener", "()Lorg/linphone/activities/assistant/fragments/CountryPickerFragment$CountryPickedListener;", "setListener", "(Lorg/linphone/activities/assistant/fragments/CountryPickerFragment$CountryPickedListener;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "CountryPickedListener", "app_debug"})
public final class CountryPickerFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable
    private org.linphone.databinding.AssistantCountryPickerFragmentBinding _binding;
    private org.linphone.activities.assistant.adapters.CountryPickerAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private org.linphone.activities.assistant.fragments.CountryPickerFragment.CountryPickedListener listener;
    
    public CountryPickerFragment() {
        super();
    }
    
    private final org.linphone.databinding.AssistantCountryPickerFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.activities.assistant.fragments.CountryPickerFragment.CountryPickedListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    org.linphone.activities.assistant.fragments.CountryPickerFragment.CountryPickedListener p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/linphone/activities/assistant/fragments/CountryPickerFragment$CountryPickedListener;", "", "onCountryClicked", "", "dialPlan", "Lorg/linphone/core/DialPlan;", "app_debug"})
    public static abstract interface CountryPickedListener {
        
        public abstract void onCountryClicked(@org.jetbrains.annotations.NotNull
        org.linphone.core.DialPlan dialPlan);
    }
}