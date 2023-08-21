package com.statuswa.fasttalkchat.toolsdownload.Fragment;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.statuswa.fasttalkchat.toolsdownload.R;
import com.statuswa.fasttalkchat.toolsdownload.adapter.EmojiAdapter;
import com.statuswa.fasttalkchat.toolsdownload.model.Emoji_Model;
import com.pesonal.adsdk.AppManage;

import java.util.ArrayList;

public class SorryFragment extends Fragment {
    private RecyclerView recycle_view;
    private ArrayList<Emoji_Model> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sorry, container, false);
        AppManage.getInstance(getActivity()).showNative((ViewGroup) view.findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        list=new ArrayList<>();
        recycle_view=view.findViewById(R.id.recycle_view);
        initList();
        recycle_view.setHasFixedSize(true);
        recycle_view.setLayoutManager(new LinearLayoutManager(getContext()));
        recycle_view.setAdapter(new EmojiAdapter(getContext(),list));
        return view;
    }

    private void initList() {
        list.add(new Emoji_Model("･ﾟ･δояяу･ﾟ･(○ﾉдﾉ)"));
        list.add(new Emoji_Model("(→_→)"));
        list.add(new Emoji_Model("(´･_･`)"));
        list.add(new Emoji_Model("◐ˍ◑"));
        list.add(new Emoji_Model("(◎_◎;)"));
        list.add(new Emoji_Model("(‘◇’)?"));
        list.add(new Emoji_Model("o(´^｀)o"));
        list.add(new Emoji_Model("ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽"));
        list.add(new Emoji_Model("【・ヘ・?】"));
        list.add(new Emoji_Model("乁║ ˙ 益 ˙ ║ㄏ"));
        list.add(new Emoji_Model("ˋ(′～`)ˊ"));
        list.add(new Emoji_Model("٩(͡๏̯͡๏"));
        list.add(new Emoji_Model("¯_| ✖ 〜 ✖ |_/¯"));
        list.add(new Emoji_Model("(@_@)"));
        list.add(new Emoji_Model("(・_・ヾ"));
        list.add(new Emoji_Model("【・_・?】"));
        list.add(new Emoji_Model("(-_-)ゞ゛"));
        list.add(new Emoji_Model("ಠ_ರೃ"));
    }
}