package app.insurance.android.com.insuranceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class AgentListActivity extends AppCompatActivity {

    private List<Agent> myAgent;
    private List<Agent> otherAgents;
    private RecyclerView rv1;
    private RecyclerView rv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_list);

        Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
        tb.setTitle("Agents List");

        rv1 =(RecyclerView)findViewById(R.id.rv1);
        rv2 =(RecyclerView)findViewById(R.id.rv2);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv1.setLayoutManager(llm);
        rv1.setHasFixedSize(true);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(llm2);
        rv2.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        myAgent = new ArrayList<>();
        myAgent.add(new Agent("Serena Wilson", "214-325-2374", "serena.wilson@gmail.com",
                "617, South High St, Columbus, OH 43216", R.drawable.person, true));
        otherAgents = new ArrayList<>();
        otherAgents.add(new Agent("Emma Wilson", "234-321-2354", "", R.drawable.person));
        otherAgents.add(new Agent("Lavery Maiss", "657-756-7563", "", R.drawable.person));
        otherAgents.add(new Agent("Lillie Watts", "564-345-5648", "", R.drawable.person));
    }

    private void initializeAdapter(){
        MyAgentAdapter adapter1 = new MyAgentAdapter(myAgent);
        rv1.setAdapter(adapter1);

        OtherAgentsAdapter adapter2 = new OtherAgentsAdapter(otherAgents);
        rv2.setAdapter(adapter2);
    }
}
