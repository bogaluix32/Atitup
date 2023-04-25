package com.example.demo.Terceros;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.edit.EditChoice;
import com.theokanning.openai.edit.EditRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ChatGPT {

    public static String obtenerRespuesta(String pregunta, int opcion){
        var service = new OpenAiService("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");
        //var service = new OpenAiService("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");
        EditRequest request = null;
        if(opcion == 1){
            request = EditRequest.builder()
                    .model("text-davinci-edit-001")
                    .input(pregunta)
                    .instruction("Responder pregunta y explicar respuesta")
                    .build();
        }
        else if(opcion == 2){
            request = EditRequest.builder()
                    .model("text-davinci-edit-001")
                    .input(pregunta)
                    .instruction("Responder con un ejemplo para la pregunta")
                    .build();
        }
        String respuesta = "";
        service.createEdit(request).getChoices();
        List<EditChoice> choices = service.createEdit(request).getChoices();
        for (EditChoice choice : choices) {
            respuesta += choice.getText().substring("EditChoice(text=".length(), choice.getText().length() - 1) + "\n.";
        }
        return respuesta;
    }
}
