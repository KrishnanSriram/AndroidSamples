package activity.recycler.sample.com.agentlistactivity;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sriramk on 1/16/17.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.AgentViewHolder> {

    public static class AgentViewHolder extends RecyclerView.ViewHolder {

        CardView cv1;
        TextView titleText;
        TextView descriptionText1;
        TextView descriptionText2;
        TextView descriptionText3;
        ImageView personPhoto;

        AgentViewHolder(View itemView) {
            super(itemView);
            cv1 = (CardView)itemView.findViewById(R.id.cv1);
            titleText = (TextView)itemView.findViewById(R.id.title_text);
            descriptionText1 = (TextView)itemView.findViewById(R.id.description_text1);
            descriptionText2 = (TextView)itemView.findViewById(R.id.description_text2);
            descriptionText3 = (TextView)itemView.findViewById(R.id.description_text3);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    List<Agent> mAgents;

    RVAdapter(List<Agent> agents){
        this.mAgents = agents;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public AgentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        AgentViewHolder pvh = new AgentViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(AgentViewHolder agentViewHolder, int i) {
        agentViewHolder.titleText.setText(mAgents.get(i).getName());
        agentViewHolder.descriptionText1.setText(mAgents.get(i).getPhone());
        agentViewHolder.descriptionText2.setText(mAgents.get(i).getEmail());
        agentViewHolder.descriptionText3.setText(mAgents.get(i).getAddress());
        agentViewHolder.personPhoto.setImageResource(mAgents.get(i).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return mAgents.size();
    }
}
