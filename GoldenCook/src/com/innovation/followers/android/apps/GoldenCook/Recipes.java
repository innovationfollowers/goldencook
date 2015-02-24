package com.innovation.followers.android.apps.GoldenCook;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Recipes extends Activity {

final static int ELEMENT_COUNT = 275;
public static int m_categorySel = 0;
int StringIds[][] = {{R.string.Catagory1_Recepie1	
		,R.string.Catagory1_Recepie2	
		,R.string.Catagory1_Recepie3	
		,R.string.Catagory1_Recepie4	
		,R.string.Catagory1_Recepie5	
		,R.string.Catagory1_Recepie6	
		,R.string.Catagory1_Recepie7	
		,R.string.Catagory1_Recepie8	
		,R.string.Catagory1_Recepie9	
		,R.string.Catagory1_Recepie10	
		,R.string.Catagory1_Recepie11},{
		R.string.Catagory2_Recepie1
		,R.string.Catagory2_Recepie2
		,R.string.Catagory2_Recepie3
		,R.string.Catagory2_Recepie4
		,R.string.Catagory2_Recepie5
		,R.string.Catagory2_Recepie6
		,R.string.Catagory2_Recepie7
		,R.string.Catagory2_Recepie8
		,R.string.Catagory2_Recepie9
		,R.string.Catagory2_Recepie10
		,R.string.Catagory2_Recepie11
		,R.string.Catagory2_Recepie12
		,R.string.Catagory2_Recepie13
		,R.string.Catagory2_Recepie14
		,R.string.Catagory2_Recepie15
		,R.string.Catagory2_Recepie16
		,R.string.Catagory2_Recepie17
		,R.string.Catagory2_Recepie18
		,R.string.Catagory2_Recepie19
		,R.string.Catagory2_Recepie20
		,R.string.Catagory2_Recepie21
		,R.string.Catagory2_Recepie22
		,R.string.Catagory2_Recepie23
		,R.string.Catagory2_Recepie25
		,R.string.Catagory2_Recepie26
		,R.string.Catagory2_Recepie27
		,R.string.Catagory2_Recepie28
		,R.string.Catagory2_Recepie29
		,R.string.Catagory2_Recepie30
		,R.string.Catagory2_Recepie31
		,R.string.Catagory2_Recepie32
		,R.string.Catagory2_Recepie33
		,R.string.Catagory2_Recepie34
		,R.string.Catagory2_Recepie35
		,R.string.Catagory2_Recepie37
		,R.string.Catagory2_Recepie38
		,R.string.Catagory2_Recepie39
		,R.string.Catagory2_Recepie40
		,R.string.Catagory2_Recepie41
		,R.string.Catagory2_Recepie42
		,R.string.Catagory2_Recepie43
		,R.string.Catagory2_Recepie44
		,R.string.Catagory2_Recepie45
		,R.string.Catagory2_Recepie46
		,R.string.Catagory2_Recepie47
		,R.string.Catagory2_Recepie48
		,R.string.Catagory2_Recepie49
		,R.string.Catagory2_Recepie50
		,R.string.Catagory2_Recepie51},{
		R.string.Catagory3_Recepie1
		,R.string.Catagory3_Recepie2
		,R.string.Catagory3_Recepie3
		,R.string.Catagory3_Recepie4
		,R.string.Catagory3_Recepie5
		,R.string.Catagory3_Recepie6
		,R.string.Catagory3_Recepie7
		,R.string.Catagory3_Recepie8
		,R.string.Catagory3_Recepie9
		,R.string.Catagory3_Recepie10
		,R.string.Catagory3_Recepie11
		,R.string.Catagory3_Recepie12
		,R.string.Catagory3_Recepie13
		,R.string.Catagory3_Recepie14
		,R.string.Catagory3_Recepie15
		,R.string.Catagory3_Recepie16
		,R.string.Catagory3_Recepie17
		,R.string.Catagory3_Recepie18
		,R.string.Catagory3_Recepie19
		,R.string.Catagory3_Recepie20
		,R.string.Catagory3_Recepie21
		,R.string.Catagory3_Recepie22
		,R.string.Catagory3_Recepie23
		,R.string.Catagory3_Recepie24
		,R.string.Catagory3_Recepie25
		,R.string.Catagory3_Recepie26
		,R.string.Catagory3_Recepie27
		,R.string.Catagory3_Recepie28
		,R.string.Catagory3_Recepie29
		,R.string.Catagory3_Recepie30
		,R.string.Catagory3_Recepie31
		,R.string.Catagory3_Recepie32
		,R.string.Catagory3_Recepie33
		,R.string.Catagory3_Recepie34
		,R.string.Catagory3_Recepie35
		,R.string.Catagory3_Recepie36
		,R.string.Catagory3_Recepie37
		,R.string.Catagory3_Recepie38
		,R.string.Catagory3_Recepie39
		,R.string.Catagory3_Recepie40
		,R.string.Catagory3_Recepie41
		,R.string.Catagory3_Recepie42
		,R.string.Catagory3_Recepie44
		,R.string.Catagory3_Recepie45
		,R.string.Catagory3_Recepie46
		,R.string.Catagory3_Recepie47
		,R.string.Catagory3_Recepie48
		,R.string.Catagory3_Recepie49
		,R.string.Catagory3_Recepie50
		,R.string.Catagory3_Recepie51
		,R.string.Catagory3_Recepie52
		,R.string.Catagory3_Recepie53
		,R.string.Catagory3_Recepie54
		,R.string.Catagory3_Recepie55
		,R.string.Catagory3_Recepie56
		,R.string.Catagory3_Recepie57
		,R.string.Catagory3_Recepie58
		,R.string.Catagory3_Recepie59
		,R.string.Catagory3_Recepie60
		,R.string.Catagory3_Recepie61
		,R.string.Catagory3_Recepie62
		,R.string.Catagory3_Recepie63
		,R.string.Catagory3_Recepie64
		,R.string.Catagory3_Recepie65
		,R.string.Catagory3_Recepie66
		,R.string.Catagory3_Recepie67
		,R.string.Catagory3_Recepie68
		,R.string.Catagory3_Recepie69
		,R.string.Catagory3_Recepie70
		,R.string.Catagory3_Recepie71
		,R.string.Catagory3_Recepie72
		,R.string.Catagory3_Recepie73
		,R.string.Catagory3_Recepie74
		,R.string.Catagory3_Recepie75
		,R.string.Catagory3_Recepie76
		,R.string.Catagory3_Recepie77
		,R.string.Catagory3_Recepie78
		,R.string.Catagory3_Recepie79
		,R.string.Catagory3_Recepie80
		,R.string.Catagory3_Recepie81
		,R.string.Catagory3_Recepie82
		,R.string.Catagory3_Recepie83
		,R.string.Catagory3_Recepie84
		,R.string.Catagory3_Recepie85
		,R.string.Catagory3_Recepie86
		,R.string.Catagory3_Recepie87
		,R.string.Catagory3_Recepie88
		,R.string.Catagory3_Recepie89
		,R.string.Catagory3_Recepie90},{
		R.string.Catagory4_Recepie1
		,R.string.Catagory4_Recepie2
		,R.string.Catagory4_Recepie3
		,R.string.Catagory4_Recepie4
		,R.string.Catagory4_Recepie5
		,R.string.Catagory4_Recepie6
		,R.string.Catagory4_Recepie7},{
		R.string.Catagory5_Recepie1
		,R.string.Catagory5_Recepie2
		,R.string.Catagory5_Recepie3
		,R.string.Catagory5_Recepie4
		,R.string.Catagory5_Recepie5
		,R.string.Catagory5_Recepie6
		,R.string.Catagory5_Recepie7
		,R.string.Catagory5_Recepie8
		,R.string.Catagory5_Recepie9
		,R.string.Catagory5_Recepie10
		,R.string.Catagory5_Recepie11
		,R.string.Catagory5_Recepie12
		,R.string.Catagory5_Recepie13
		,R.string.Catagory5_Recepie14
		,R.string.Catagory5_Recepie15},{
		R.string.Catagory6_Recepie1
		,R.string.Catagory6_Recepie2
		,R.string.Catagory6_Recepie3
		,R.string.Catagory6_Recepie4
		,R.string.Catagory6_Recepie5
		,R.string.Catagory6_Recepie6
		,R.string.Catagory6_Recepie7
		,R.string.Catagory6_Recepie8
		,R.string.Catagory6_Recepie9
		,R.string.Catagory6_Recepie10
		,R.string.Catagory6_Recepie11
		,R.string.Catagory6_Recepie12},{
		R.string.Catagory7_Recepie1
		,R.string.Catagory7_Recepie2
		,R.string.Catagory7_Recepie3
		,R.string.Catagory7_Recepie4
		,R.string.Catagory7_Recepie5
		,R.string.Catagory7_Recepie6
		,R.string.Catagory7_Recepie7
		,R.string.Catagory7_Recepie8
		,R.string.Catagory7_Recepie9
		,R.string.Catagory7_Recepie10
		,R.string.Catagory7_Recepie11
		,R.string.Catagory7_Recepie12
		,R.string.Catagory7_Recepie13
		,R.string.Catagory7_Recepie14
		,R.string.Catagory7_Recepie15
		,R.string.Catagory7_Recepie16
		,R.string.Catagory7_Recepie17
		,R.string.Catagory7_Recepie18
		,R.string.Catagory7_Recepie19
		,R.string.Catagory7_Recepie20
		,R.string.Catagory7_Recepie21
		,R.string.Catagory7_Recepie22
		,R.string.Catagory7_Recepie23
		,R.string.Catagory7_Recepie24
		,R.string.Catagory7_Recepie25
		,R.string.Catagory7_Recepie26
		,R.string.Catagory7_Recepie27
		,R.string.Catagory7_Recepie28
		,R.string.Catagory7_Recepie29
		,R.string.Catagory7_Recepie30
		,R.string.Catagory7_Recepie31
		,R.string.Catagory7_Recepie32
		,R.string.Catagory7_Recepie33
		,R.string.Catagory7_Recepie34
		,R.string.Catagory7_Recepie35
		,R.string.Catagory7_Recepie36
		,R.string.Catagory7_Recepie37
		,R.string.Catagory7_Recepie38
		,R.string.Catagory7_Recepie39
		,R.string.Catagory7_Recepie40
		,R.string.Catagory7_Recepie41
		,R.string.Catagory7_Recepie42
		,R.string.Catagory7_Recepie43
		,R.string.Catagory7_Recepie44
		,R.string.Catagory7_Recepie45
		,R.string.Catagory7_Recepie46
		,R.string.Catagory7_Recepie47
		,R.string.Catagory7_Recepie48
		,R.string.Catagory7_Recepie49
		,R.string.Catagory7_Recepie50
		,R.string.Catagory7_Recepie51
		,R.string.Catagory7_Recepie52
		,R.string.Catagory7_Recepie53
		,R.string.Catagory7_Recepie54
		,R.string.Catagory7_Recepie55
		,R.string.Catagory7_Recepie56
		,R.string.Catagory7_Recepie57
		,R.string.Catagory7_Recepie58
		,R.string.Catagory7_Recepie59
		,R.string.Catagory7_Recepie60
		,R.string.Catagory7_Recepie61
		,R.string.Catagory7_Recepie62
		,R.string.Catagory7_Recepie63},{
		R.string.Catagory8_Recepie1
		,R.string.Catagory8_Recepie2
		,R.string.Catagory8_Recepie3
		,R.string.Catagory8_Recepie4
		,R.string.Catagory8_Recepie5
		,R.string.Catagory8_Recepie6
		,R.string.Catagory8_Recepie7
		,R.string.Catagory8_Recepie8
		,R.string.Catagory8_Recepie9
		,R.string.Catagory8_Recepie10
		,R.string.Catagory8_Recepie11
		,R.string.Catagory8_Recepie12
		,R.string.Catagory8_Recepie13
		,R.string.Catagory8_Recepie14
		,R.string.Catagory8_Recepie15
		,R.string.Catagory8_Recepie16
		,R.string.Catagory8_Recepie17
		,R.string.Catagory8_Recepie18
		,R.string.Catagory8_Recepie19
		,R.string.Catagory8_Recepie20
		,R.string.Catagory8_Recepie21
		,R.string.Catagory8_Recepie22
		,R.string.Catagory8_Recepie23
		,R.string.Catagory8_Recepie24},{
		R.string.Catagory9_Recepie1
		,R.string.Catagory9_Recepie2
		,R.string.Catagory9_Recepie3},{
		R.string.Catagory10_Recepie1},{
		R.string.Catagory11_Recepie1}
};


	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        String[] elements = new String[StringIds[m_categorySel].length];
        
        for (int i = 0; i< StringIds[m_categorySel].length; i++) {
        	elements[i] = getResources().getString(StringIds[m_categorySel][i]);
        }
        
        MyAdapter adapter = new MyAdapter(this,elements);

        final ListView list = (ListView) findViewById(R.id.list3d);
        list.setDivider( null ); 
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Recipes.this, Description.class);
				intent.putExtra("PositionValue",position);
				startActivity(intent);
			}
		});
    }
}
