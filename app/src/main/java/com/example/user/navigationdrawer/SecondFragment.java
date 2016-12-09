package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragment extends Fragment{
    View myView;
    private CanvasView customCanvas;

    public void setMiactivity(MainActivity miactivity) {
        this.miactivity = miactivity;
    }

    private MainActivity miactivity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.second_layout, container, false);
        customCanvas = (CanvasView) miactivity.findViewById(R.id.signature_canvas);
        return  myView;
    }
    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }
}
