package com.example.yangkangjun.myapplication;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by yangkangjun on 2018/3/20.
 */

public class ItemAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public ItemAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final String item) {


        TextView tv = helper.getView(R.id.tv);
        int width = mContext.getResources().getDisplayMetrics().widthPixels;

        if (helper.getLayoutPosition() % 2 == 0) {
            tv.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));
        } else {
            tv.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
        }

        LinearLayout.LayoutParams imageViewParams = (LinearLayout.LayoutParams) tv.getLayoutParams();
        imageViewParams.width = width / 2;
        tv.setLayoutParams(imageViewParams);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, item, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
