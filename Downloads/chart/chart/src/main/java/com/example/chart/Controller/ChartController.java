package com.example.chart.Controller;

import com.example.chart.model.DataSet;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ChartController {
    @GetMapping("/chart")
    public String showChartForm(Model model){
        model.addAttribute("dataSet", new DataSet());
        return "chartForm";
    }

    @PostMapping("/chart")
    public String processChartForm(DataSet dataSet, Model model){
        model.addAttribute("xAxisLabels", dataSet.getxAxisLabels());
        model.addAttribute("yAxisValues", dataSet.getyAxisValues());
        model.addAttribute("chartType", dataSet.getChartType());
        return "chart";
    }
}

/* JFreeChart.............
    @PostMapping("/generateChart")
    public String generateChart(String data, Model model){
        JFreeChart chart = createChart(data);

        String filepath = " C:\\Users\\MGSUser\\Downloads\\chart\\chart\\chart.png";
        try{
            ChartUtils.saveChartAsPNG(new File("chart.png"), chart, 400,300);
        } catch (IOException e){
            e.printStackTrace();
        }

        model.addAttribute("chartImage", "chart.png");
        return "chartResult";
    }

    private JFreeChart createChart(String data){
        DefaultPieDataset dataset = new DefaultPieDataset();

        return ChartFactory.createPieChart("Chart Title", dataset, true, true, false);
    }
}*/


