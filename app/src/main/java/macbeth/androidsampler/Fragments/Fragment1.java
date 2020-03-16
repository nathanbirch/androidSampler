package macbeth.androidsampler.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import macbeth.androidsampler.R;

public class Fragment1 extends Fragment {

    FragmentsPresenter presenter = null;
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Load the fragment view
        rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        presenter = ((FragmentsActivity) getActivity()).getPresenter();
        // Register this fragment with the presenter
        if (presenter != null) {
            presenter.registerFragment1(this);
        }
        // Get the system time from the bundle arguments
        Bundle args = getArguments();
        TextView tvTime = rootView.findViewById(R.id.textView13);
        tvTime.setText(args.getString("SystemTime"));
        return rootView;
    }

    public void displayMessage(String message) {
        TextView tvMessage = rootView.findViewById(R.id.editText6);
        tvMessage.setText(message);
    }
}
