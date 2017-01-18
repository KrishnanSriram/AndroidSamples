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

public class OtherAgentsAdapter  extends RecyclerView.Adapter<RVAdapter.AgentViewHolder> {
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
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    List<Agent> mAgents;

    OtherAgentsAdapter(List<Agent> agents){
        this.mAgents = agents;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public RVAdapter.AgentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.other_agent_list, viewGroup, false);
        RVAdapter.AgentViewHolder pvh = new RVAdapter.AgentViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter.AgentViewHolder agentViewHolder, int i) {
        agentViewHolder.titleText.setText(mAgents.get(i).getName());
        agentViewHolder.descriptionText1.setText(mAgents.get(i).getPhone());
        agentViewHolder.personPhoto.setImageResource(mAgents.get(i).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return mAgents.size();
    }
}
