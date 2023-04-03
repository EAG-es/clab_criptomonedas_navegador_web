package ingui.javafx.clab_criptomonedas_navegador_web;

import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_delete;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_index_html;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_insert;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_clave;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_conexion;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_driver;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_url;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_usuario;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_letras_por_linea;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_cabecera_tex;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_tex;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_count;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_pagina_tam;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_update;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clave_index;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_formulario_tex;
import ingui.javafx.navegador_web.Navegador_web;
import innui.modelos.comunicaciones.url.urls;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.Resources;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import java.io.InputStream;
import static java.lang.System.err;
import static java.lang.System.exit;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import inweb.modelos_html.formularios.web_formularios;

/**
 *
 * @author emilio
 */
public class Clab_criptomonedas_navegador_web extends Navegador_web {
    public static String k_in_ruta = "in/ingui/javafx/clab_criptomonedas_navegador_web/in";
    public static String k_icono_ruta = "/re/static/ingui.javafx.clab_criptomonedas_navegador_web.png";
    public static String k_imagen_cabecera_ruta = "/re/static/ingui.javafx.clab_criptomonedas_navegador_web.cripto_y_mas.png";
    public static String k_index_ruta = "/re/templates/clab_criptomonedas/index.html";
    public static String k_opciones_mapa_nombre_fragmento_html = "html";
    public static String k_titulo_tex = "titulo_tex";
    public static String k_mensaje_imagen_tex = "mensaje_imagen_tex";
    public static String k_imagen_ruta_tex = "imagen_ruta_tex";
    public static String k_mensaje_cabecera_tex = "mensaje_cabecera_tex";
    public Map <String, Object> lecturas_web_formulario_opciones_mapa = new HashMap<>();   
    public Clab_criptomonedas clab_criptomoneda = new Clab_criptomonedas();
    public iniciales inicial = new iniciales () {
        @Override
        public boolean run(oks ok, Object... extra_array) throws Exception {
            try {
                iniciar(ok);                
                if (ok.es) { 
                    if (extra_array.length > 1 
                    && (Boolean) extra_array[1]) {
                        Clab_criptomonedas_navegador_web.super.inicial.run(ok, Clab_criptomonedas_navegador_web.class, extra_array[0]);
                    }
                    oks ok_fin = new oks();
                    terminar(ok_fin);
                    if (ok_fin.es == false) {
                        ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                    }
                }
                return ok.es;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public boolean iniciar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos_html.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }

        @Override
        public boolean terminar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos_html.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }
        
        @Override
        public boolean escribir_linea_error(String mensaje, oks ok, Object ... extras_array) {
            boolean ret = true;
            if (_contenedor_principalController != null) {
                ret = _contenedor_principalController.poner_error(mensaje, ok);
            }
            err.printf(ok.txt);
            return ret;
        }    
    };

    public Clab_criptomonedas_navegador_web() throws Exception {        
    }
    
    public static void main(String[] args) {
        oks ok = new oks();
        Clab_criptomonedas_navegador_web clab_criptomonedas_navegador_web = null;
        try {
            clab_criptomonedas_navegador_web = new Clab_criptomonedas_navegador_web();
            Object [] extra_array = { args
            , true };
            clab_criptomonedas_navegador_web.inicial.run(ok, extra_array);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }
    /**
     * Realiza la operativa de navegar para presentar una página web
     * @param parametros_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    @Override
    public boolean navegar(List<String> parametros_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        inicial.iniciar(ok, extra_array);
        if (ok.es) {
            while (true) {
                configurar(ok);
                if (ok.es == false) { break; }
                clab_criptomoneda.crear_formulario_lectura(ok);
                if (ok.es == false) { break; }
                clab_criptomoneda.crear_formulario_insercion(ok);
                if (ok.es == false) { break; }
                clab_criptomoneda.crear_formulario_borrado(ok);
                if (ok.es == false) { break; }
                Long filas_cuenta = clab_criptomoneda.leer_cuenta_filas_criptomonedas(ok);
                if (ok.es == false) { return false; }
                clab_criptomoneda.capturar_lecturas_web_formulario(0, filas_cuenta, ok);
                if (ok.es == false) { break; }
                construir_formulario_index(ok);
                if (ok.es == false) { break; }
                capturar_formulario_index(clab_criptomoneda.index_valores_mapa, ok);
                break;
            }
            oks ok_fin = new oks();
            inicial.terminar(ok_fin);
            if (ok_fin.es == false) {
                ok.setTxt(ok.getTxt(), ok_fin.getTxt());
            }
        }
        return ok.es;
    }
    /**
     * Pone el icono de la aplicación
     * @param stage Escenario donde poner el icono
     * @param ok
     * @param extra_array
     * @return true si tiene éxito, false si hay error.
     * @throws java.lang.Exception
     */
    @Override
    public boolean poner_icono(Stage stage, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ObservableList<Image> observableList = stage.getIcons();
        InputStream inputStream = this.getClass().getResourceAsStream(
            k_icono_ruta); 
        Image image = new Image(inputStream);
        observableList.add(image);
        return ok.es;
    }
    /**
     * 
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */    
    public boolean construir_formulario_index(oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            clab_criptomoneda.index.iniciar(k_index_ruta, clab_criptomoneda.index_valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            lecturas_web_formulario_opciones_mapa.put(k_nombre_fragmento, k_opciones_mapa_nombre_fragmento_html);
            clab_criptomoneda.index_valores_mapa.clear();
            clab_criptomoneda.index_valores_mapa.put(k_titulo_tex, tr.in(in, "CLAB Criptomonedas navegador web"));
            clab_criptomoneda.index_valores_mapa.put(k_mensaje_imagen_tex, k_imagen_cabecera_ruta);
            URL imagen_url;
            imagen_url = Resources.getResource(k_imagen_cabecera_ruta);
            clab_criptomoneda.index_valores_mapa.put(k_imagen_ruta_tex, "file://" + imagen_url.getPath());
            clab_criptomoneda.index_valores_mapa.put(k_mensaje_cabecera_tex, tr.in(in, "CLAB Criptomonedas navegador web"));
            clab_criptomoneda.index_valores_mapa.put(k_formulario_tex, clab_criptomoneda.lectura_web_formulario.getContenido_formulario_html());
            inweb.modelos_html.formularios.control_textos control_texto = new inweb.modelos_html.formularios.control_textos();
            if (ok.es == false) { return ok.es; }
            control_texto.poner_en_formulario(clab_criptomoneda.index, k_clave_index, clab_criptomoneda.index_valores_mapa, null, lecturas_web_formulario_opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    public boolean capturar_formulario_index(Map <String, String> valores_mapa, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            clab_criptomoneda.index.iniciar(k_index_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            clab_criptomoneda.index.capturar(ok);
            if (ok.es == false) { return ok.es; }
            webview_simpleController_implementacion.presentar_contenido(clab_criptomoneda.index.getContenido_formulario_html(), ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    /**
     * Captura las URLs que son llamadas (clic) en el navegador 
     * @param url
     * @param ok
     * @param extras_array
     * @return true si todo es correcto, false/null si hay error.
     * @throws Exception 
     */
    @Override
    public Boolean procesar_evento_llamada_a_url(URL url, oks ok, Object ... extras_array) throws Exception {
        Boolean retorno;
        retorno = procesar_formulario(url, ok, extras_array);
        oks ok_fin = new oks();
        inicial.terminar(ok_fin);
        if (ok_fin.es == false) {
            ok.setTxt(ok.getTxt(), ok_fin.getTxt());
        }
        return retorno;
    }
    /**
     * Obtiene las propiedades de configuración 
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean configurar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            clab_criptomoneda.url = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            if (clab_criptomoneda.url == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            }
            clab_criptomoneda.driver = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            if (clab_criptomoneda.driver == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            }
            clab_criptomoneda.conexion = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            if (clab_criptomoneda.conexion == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            }
            clab_criptomoneda.usuario = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            if (clab_criptomoneda.usuario == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            }
            clab_criptomoneda.clave = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            if (clab_criptomoneda.clave == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            }
            clab_criptomoneda.select = inicial.properties.getProperty(k_clab_criptomonedas_select);
            if (clab_criptomoneda.select == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select);
            }
            clab_criptomoneda.select_columnas_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_tex);
            if (clab_criptomoneda.select_columnas_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_tex);
            }
            clab_criptomoneda.select_columnas_cabecera_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_cabecera_tex);
            if (clab_criptomoneda.select_columnas_cabecera_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_cabecera_tex);
            }
            clab_criptomoneda.select_pagina_tam = inicial.properties.getProperty(k_clab_criptomonedas_select_pagina_tam);
            if (clab_criptomoneda.select_pagina_tam == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_pagina_tam);
            } else {
                clab_criptomoneda.pagina_tam = Integer.valueOf(clab_criptomoneda.select_pagina_tam);
            }
            clab_criptomoneda.select_count = inicial.properties.getProperty(k_clab_criptomonedas_select_count);
            if (clab_criptomoneda.select_count == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_count);
            }
            clab_criptomoneda.insert = inicial.properties.getProperty(k_clab_criptomonedas_insert);
            if (clab_criptomoneda.insert == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_insert);
            }
            clab_criptomoneda.update = inicial.properties.getProperty(k_clab_criptomonedas_update);
            if (clab_criptomoneda.update == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_update);
            }
            clab_criptomoneda.delete = inicial.properties.getProperty(k_clab_criptomonedas_delete);
            if (clab_criptomoneda.delete == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_delete);
            }
            clab_criptomoneda.letras_por_linea = inicial.properties.getProperty(k_clab_criptomonedas_letras_por_linea);
            if (clab_criptomoneda.letras_por_linea == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_letras_por_linea);
            }
            if (ok.es == false) {
                inicial.escribir_linea_error(ok.getTxt(), ok, extra_array);
            }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Procesa los datos recibidos de una petición HTTP/S Get
     * @param url
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public boolean procesar_formulario(URL url, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            if (url.getPath().endsWith(k_clab_criptomonedas_index_html)) {
                Map<String, String> datos_mapa = new LinkedHashMap<>();
                Map.Entry<String, Object> nueva_entrada;
                urls.extraer_parametros_query(url, datos_mapa, ok);
                if (ok.es == false) { return ok.es; }
                String texto_html = clab_criptomoneda.procesar_formulario(datos_mapa, ok, extras_array);
                if (ok.es == false) { return ok.es; }
                List<Map.Entry<String, Object>> index_claves_valor_lista = clab_criptomoneda.index.exportar_valores(k_clave_index, ok, extras_array);
                nueva_entrada = index_claves_valor_lista.get(0);
                Map<String, String> valores_mapa = (Map<String, String>) nueva_entrada.getValue();
                valores_mapa.put(k_formulario_tex, texto_html);
                clab_criptomoneda.index.importar_valores(k_clave_index, index_claves_valor_lista, ok, extras_array);
                if (ok.es == false) { return ok.es; }
                capturar_formulario_index(clab_criptomoneda.index_valores_mapa, ok);
                if (ok.es == false) { return ok.es; }
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
}
