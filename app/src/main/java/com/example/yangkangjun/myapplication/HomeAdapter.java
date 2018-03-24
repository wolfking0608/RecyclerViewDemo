package com.example.yangkangjun.myapplication;

import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangkangjun on 2018/3/20.
 */

public class HomeAdapter extends BaseQuickAdapter<String,BaseViewHolder>{
    public HomeAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(""+i);
        }
        RecyclerView rv = helper.getView(R.id.item_rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        ItemAdapter adapter =  new ItemAdapter(R.layout.child_item,data);
        rv.setAdapter(adapter);
     
    }
}
