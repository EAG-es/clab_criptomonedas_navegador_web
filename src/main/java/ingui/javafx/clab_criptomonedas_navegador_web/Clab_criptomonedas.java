package ingui.javafx.clab_criptomonedas_navegador_web;

import incli.restful.jdbc_servidor_https_spring.cliente_jdbc_servidor_https_spring;
import static inclui.formularios.control_entradas.k_entradas_tipo_boton;
import static inclui.formularios.control_entradas.k_entradas_tipo_hidden;
import static inclui.formularios.control_entradas.k_entradas_tipo_numero;
import static inclui.formularios.control_entradas.k_entradas_tipo_submit;
import static inclui.formularios.control_entradas.k_entradas_tipo_texto;
import static inclui.formularios.control_tablas.k_control_tablas_opciones_mapa_lista;
import innui.bases;
import static innui.formularios.controles.k_opciones_mapa_no_requerido;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.jdbc.sql_comandos;
import static innui.modelos.jdbc.sql_comandos.k_sql_comandos_marcador_columnas_lista_error;
import innui.modelos.tipos_valores;
import inweb.modelos_html.formularios.web_formularios;
import inweb.modelos_html.formularios.control_entradas;
import inweb.modelos_html.formularios.control_redirecciones;
import inweb.modelos_html.formularios.control_tablas;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import static inweb.modelos_html.formularios.control_entradas.k_valores_mapa_style_fragmento_cancelar_tex;
import static inweb.modelos_html.formularios.control_entradas.k_valores_mapa_style_fragmento_submit_tex;
import static inweb.modelos_html.formularios.control_entradas.k_valores_mapa_style_submit_tex;
import static inweb.modelos_html.formularios.control_tablas.k_control_tablas_opciones_mapa_tabla_fila_fragmento;
import static inweb.modelos_html.formularios.control_tablas.k_control_tablas_opciones_mapa_tabla_fragmento;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_mensaje_error_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_url_destino_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_valor_tex;
import java.util.AbstractMap.SimpleEntry;

/**
 *
 * @author emilio
 */
public class Clab_criptomonedas extends bases {
    public static final String k_avanzar = "avanzar";
    public static final String k_retroceder = "retroceder";
    public static final String k_ir = "ir";
    public static final String k_crear = "crear";
    public static final String k_crear_procesar = "crear_procesar";
    public static final String k_actualizar = "actualizar";
    public static final String k_actualizar_procesar = "actualizar_procesar";
    public static final String k_borrar = "borrar";
    public static final String k_borrar_procesar = "borrar_procesar";
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/ingui/javafx/clab_criptomonedas_navegador_web/in";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_url = "clab_criptomonedas.jdbc_servidor_http_spring.url";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_driver = "clab_criptomonedas.jdbc_servidor_http_spring.driver";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_conexion = "clab_criptomonedas.jdbc_servidor_http_spring.conexion";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_usuario = "clab_criptomonedas.jdbc_servidor_http_spring.usuario";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_clave = "clab_criptomonedas.jdbc_servidor_http_spring.clave";
    public static String k_clab_criptomonedas_select = "clab_criptomonedas.select";
    public static String k_clab_criptomonedas_select_count = "clab_criptomonedas.select_count";
    public static String k_clab_criptomonedas_insert = "clab_criptomonedas.insert";
    public static String k_clab_criptomonedas_update = "clab_criptomonedas.update";
    public static String k_clab_criptomonedas_delete = "clab_criptomonedas.delete";
    public static String k_clab_criptomonedas_select_pagina_tam = "clab_criptomonedas.select.pagina_tam";
    public static String k_clab_criptomonedas_select_columnas_tex="clab_criptomonedas.select_columnas_tex";
    public static String k_clab_criptomonedas_select_columnas_cabecera_tex="clab_criptomonedas.select_columnas_cabecera_tex";
    public static String k_clab_criptomonedas_letras_por_linea="clab_criptomonedas.letras_por_linea";
    public static String k_lectura_clave_tabla = "lectura_clave_tabla";
    public static String k_lectura_clave_crear = "lectura_clave_crear";
    public static String k_lectura_clave_actualizar = "actualizar.";
    public static String k_lectura_clave_borrar = "borrar.";
    public static String k_paginacion_clave_retroceder = "paginacion_clave_retroceder";
    public static String k_paginacion_clave_avanzar = "paginacion_clave_avanzar";
    public static String k_paginacion_clave_ir = "paginacion_clave_ir";
    public static String k_paginacion_clave_fila_num = "paginacion_clave_fila_num";
    public static String k_insercion_clave_id_criptomoneda_previo = "insercion_clave_id_criptomoneda_previo";
    public static String k_insercion_clave_tipo_operacion = "insercion_clave_tipo_operacion";
    public static String k_tipo_operacion_insertar = "tipo_operacion_insertar";
    public static String k_tipo_operacion_actualizar = "tipo_operacion_actualizar";
    public static String k_insercion_clave_enviar = "insercion_clave_enviar";
    public static String k_insercion_clave_cancelar = "insercion_clave_cancelar";
    public static String k_borrado_clave_id_criptomoneda = "borrado_clave_id_criptomoneda";
    public static String k_borrado_clave_enviar = "borrado_clave_enviar";
    public static String k_borrado_clave_cancelar = "borrado_clave_cancelar";
    public static String k_borrado_clave_fila_num = "borrado_clave_fila_num";
    public static String k_columna_cuenta_tex = "cuenta";
    public static String k_valores_mapa_info_tabla_tex = "info_tabla_tex";
    public static String k_valores_mapa_tabla_cuerpo = "tabla_cuerpo";
    public static String k_valores_mapa_id_criptomoneda = "id_criptomoneda";
    public static String k_valores_mapa_simbolo = "simbolo";
    public static String k_valores_mapa_capitalizacion_de_mercado = "capitalizacion_de_mercado";
    public static String k_valores_mapa_aporte_circulante = "aporte_circulante";
    public static String k_valores_mapa_capitalizacion_total_diluida = "capitalizacion_total_diluida";
    public static String k_valores_mapa_aporte_total = "aporte_total";
    public static String k_valores_mapa_aporte_maximo = "aporte_maximo";
    public static String k_valores_mapa_dominancia = "dominancia";
    public static String k_valores_mapa_total_valor_bloqueado = "total_valor_bloqueado";
    public static String k_valores_mapa_fecha_actualizacion = "fecha_actualizacion";
    public static String k_opciones_mapa_nombre_fragmento_control_tablas_criptomonedas = "control_tablas_criptomonedas";
    public static String k_opciones_mapa_nombre_fragmento_control_tablas_fila_criptomonedas = "control_tablas_fila_criptomonedas";    
    public static String k_boton_actualizar_tex = "boton_actualizar_tex";
    public static String k_boton_borrar_tex = "boton_borrar_tex";
    public static String k_clab_criptomonedas_inicio_url = "https://localhost";
    public static String k_clab_criptomonedas_index_html = "/clab_criptomonedas/index_html";
    public static String k_clab_criptomonedas_cancelar_html = null;
    public static String k_fragmentos_principales_ruta = "/re/templates/formularios/fragmentos/fragmentos_principales.html";
    public static String k_fragmentos_clab_criptomonedas_ruta = "/re/templates/clab_criptomonedas/fragmentos/fragmentos_clab_criptomonedas.html";
    public static String k_clave_index = "index";
    public static String k_formulario_tex = "formulario_tex";
    public static String k_borrado_web_formularios = "borrado_web_formularios";
    public String url;
    public String driver;
    public String conexion;
    public String usuario;
    public String clave;
    public String select;
    public String select_columnas_tex;
    public String select_columnas_cabecera_tex;
    public String select_count;
    public String select_pagina_tam;
    public Integer pagina_tam;
    public String letras_por_linea;
    public String insert;
    public String update;
    public String delete;
    public LinkedList<LinkedHashMap<String, Object>> lecturas_lista;
    public LinkedList<LinkedHashMap<String, Object>> lecturas_textos_lista;
    public web_formularios lectura_web_formulario = new web_formularios() {
        @Override
        public boolean _crear_valores_mapa(Map<String, String> nuevos_datos_mapa, oks ok, Object ... extras_array) throws Exception {
            try {
                if (ok.es == false) { return false; }
                super._crear_valores_mapa(nuevos_datos_mapa, ok, extras_array);
                if (ok.es == false) { return false; }
                valores_mapa.put(k_valores_mapa_info_tabla_tex, "");
                valores_mapa.put(k_valores_mapa_tabla_cuerpo, "");
                valores_mapa.put(k_valores_mapa_id_criptomoneda, "");
                valores_mapa.put(k_valores_mapa_simbolo, "");
                valores_mapa.put(k_valores_mapa_capitalizacion_de_mercado, "");
                valores_mapa.put(k_valores_mapa_aporte_circulante, "");
                valores_mapa.put(k_valores_mapa_capitalizacion_total_diluida, "");
                valores_mapa.put(k_valores_mapa_aporte_total, "");
                valores_mapa.put(k_valores_mapa_aporte_maximo, "");
                valores_mapa.put(k_valores_mapa_dominancia, "");
                valores_mapa.put(k_valores_mapa_total_valor_bloqueado, "");
                valores_mapa.put(k_valores_mapa_fecha_actualizacion, "");
                return ok.es;
            } catch (Exception e) {
                throw e;
            }
        }
    };
    public cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
    public control_tablas lectura_control_tabla = new control_tablas();
    public control_entradas paginacion_avanzar_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_retroceder_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_ir_control_entrada = new control_entradas();
    public control_entradas paginacion_ir_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_crear_boton_control_entrada = new control_entradas();
    public web_formularios borrado_web_formulario = new web_formularios();
    public web_formularios insercion_web_formulario = new web_formularios() {        
        @Override
        public boolean importar_valores(List<Entry<String, Object>> clave_valor_lista, oks ok, Object ... extras_array) throws Exception {
            ResourceBundle in;
            try {
                if (ok.es == false) { return false; }
                _controles_lista.get(0).importar_captura(clave_valor_lista.get(0).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(1).importar_captura(clave_valor_lista.get(1).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(2).importar_captura(clave_valor_lista.get(2).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(3).importar_captura(clave_valor_lista.get(3).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(4).importar_captura(clave_valor_lista.get(4).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(5).importar_captura(clave_valor_lista.get(5).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(6).importar_captura(clave_valor_lista.get(6).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(7).importar_captura(clave_valor_lista.get(7).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(8).importar_captura(clave_valor_lista.get(8).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(9).importar_captura(clave_valor_lista.get(9).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(10).importar_captura(clave_valor_lista.get(10).getValue(), ok);
                if (ok.es == false) { return false; }
                fila_inicio_pagina = Long.valueOf(clave_valor_lista.get(10).getValue().toString());
                if (ok.es == false) { return false; }
            } catch (Exception e) {
                throw e;
            }
            return ok.es;
        }
    };
    public Long fila_inicio_pagina = 0L;
    public web_formularios index = new web_formularios();
    public Map <String, String> index_valores_mapa = new HashMap<>();

    public Clab_criptomonedas() {
        k_clab_criptomonedas_cancelar_html = "?" + k_paginacion_clave_ir + "=&" + k_paginacion_clave_fila_num + "=0";
    }
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param operacion_tex
     * @param id_criptomoneda Para las operaciones de borrar y actualizar
     * @param formulario_claves_valor_lista datos recibidos del formulario
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return 
     * @throws Exception Opción de notificar errores de excepción
     */
    public String procesar_clab_formularios(String operacion_tex, String id_criptomoneda, List<Entry<String, Object>> formulario_claves_valor_lista, oks ok, Object ... extras_array) throws Exception {
        String texto_html = null;
        try {
            if (ok.es == false) { return null; }
            ResourceBundle in = null;
            in = ResourceBundles.getBundle(k_in_ruta);
            Long filas_cuenta = 0L;
            for (Entry<String, Object> entry : formulario_claves_valor_lista) {
                if (entry.getKey().equals(k_paginacion_clave_fila_num)) {
                    fila_inicio_pagina = Long.valueOf(entry.getValue().toString());
                    fila_inicio_pagina = fila_inicio_pagina - 1;
                    break;
                }
            }
            if (operacion_tex.equals(k_crear_procesar)) {
                for (Entry<String, Object> entry : formulario_claves_valor_lista) {
                    if (entry.getKey().equals(k_insercion_clave_tipo_operacion)) {
                        if (entry.getValue().toString().equals(k_tipo_operacion_actualizar)) {
                            operacion_tex = k_actualizar_procesar;
                        }
                        break;
                    }
                }
            }
            lectura_web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, "");
            filas_cuenta = leer_cuenta_filas_criptomonedas(ok);
            if (ok.es == false) { return null; }
            switch (operacion_tex) {
            case k_retroceder -> {
                if (fila_inicio_pagina > 0) {
                    fila_inicio_pagina = fila_inicio_pagina - pagina_tam;
                    if (fila_inicio_pagina < 0) {
                        fila_inicio_pagina = 0L;
                    }
                } 
                capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                if (ok.es == false) { return null; }
                texto_html = lectura_web_formulario.getContenido_formulario_html();
            }
            case k_avanzar -> {
                if (fila_inicio_pagina < filas_cuenta) {
                    if (fila_inicio_pagina + pagina_tam  < filas_cuenta) {
                        fila_inicio_pagina = fila_inicio_pagina + pagina_tam;
                    }
                } 
                capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                if (ok.es == false) { return null; }
                texto_html = lectura_web_formulario.getContenido_formulario_html();
            }
            case k_ir -> {
                if (fila_inicio_pagina < 0) {
                    fila_inicio_pagina = 0L;
                } else if (fila_inicio_pagina > filas_cuenta) {
                    escribir_error(lectura_web_formulario, tr.in(in, "El valor debe estar entre ") + 1 
                    + tr.in(in, " y ") + filas_cuenta, ok);
                }
                capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                if (ok.es == false) { return null; }
                texto_html = lectura_web_formulario.getContenido_formulario_html();
            }
            case k_crear -> {
                capturar_creacion_web_formulario(id_criptomoneda, ok);
                if (ok.es == false) { return null; }
                texto_html = insercion_web_formulario.getContenido_formulario_html();
            }
            case k_crear_procesar -> {
                insercion_web_formulario.importar_valores(formulario_claves_valor_lista, ok, extras_array);
                if (ok.es == false) { return null; }
                insercion_web_formulario.procesar(ok, extras_array);
                if (ok.es == false) { return null; }
                String error_tex = insercion_web_formulario.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                if (error_tex.isEmpty() == false) {
                    texto_html = insercion_web_formulario.getContenido_formulario_html();
                } else {
                    LinkedList<Object> valores_lista = new LinkedList<>();
                    for (Entry<String, Object> entry : formulario_claves_valor_lista) {
                        if (entry.getValue() == null) {
                            valores_lista.add(null);
                        } else if (entry.getValue().toString().isBlank()) {
                            valores_lista.add(null);
                        } else {
                            valores_lista.add(entry.getValue());
                        }
                    }
                    crear_fila(valores_lista, ok);
                    if (ok.es == false) { break; }
                    in = ResourceBundles.getBundle(k_in_ruta);
                    error_tex = tr.in(in, "Operativa completada con éxito. ");
                    lectura_web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
                    capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                    if (ok.es == false) { return null; }
                    texto_html = lectura_web_formulario.getContenido_formulario_html();
                }
            }
            case k_actualizar -> {
                capturar_actualizacion_web_formulario(id_criptomoneda, ok);
                if (ok.es == false) { return null; }
                texto_html = insercion_web_formulario.getContenido_formulario_html();
            }
            case k_actualizar_procesar -> {
                insercion_web_formulario.importar_valores(formulario_claves_valor_lista, ok, extras_array);
                if (ok.es == false) { return null; }
                insercion_web_formulario.procesar(ok, extras_array);
                if (ok.es == false) { return null; }
                String error_tex = insercion_web_formulario.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                if (error_tex.isEmpty() == false) {
                    texto_html = insercion_web_formulario.getContenido_formulario_html();
                } else {
                    LinkedList<Object> valores_lista = new LinkedList<>();
                    for (Entry<String, Object> entry : formulario_claves_valor_lista) {
                        if (entry.getValue() == null) {
                            valores_lista.add(null);
                        } else if (entry.getValue().toString().isBlank()) {
                            valores_lista.add(null);
                        } else {
                            valores_lista.add(entry.getValue());
                        }
                    }
                    actualizar_fila(valores_lista, ok);
                    if (ok.es == false) { break; }
                    in = ResourceBundles.getBundle(k_in_ruta);
                    error_tex = tr.in(in, "Operativa completada con éxito. ");
                    lectura_web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
                    capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                    if (ok.es == false) { return null; }
                    texto_html = lectura_web_formulario.getContenido_formulario_html();
                }
            }
            case k_borrar -> {
                capturar_borrado_web_formulario(id_criptomoneda, ok);
                if (ok.es == false) { return null; }
                texto_html = borrado_web_formulario.getContenido_formulario_html();
            }
            case k_borrar_procesar -> {
                borrado_web_formulario.importar_valores(formulario_claves_valor_lista, ok, extras_array);
                if (ok.es == false) { return null; }
                borrado_web_formulario.procesar(ok, extras_array);
                if (ok.es == false) { return null; }
                String error_tex = borrado_web_formulario.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                if (error_tex.isEmpty() == false) {
                    texto_html = borrado_web_formulario.getContenido_formulario_html();
                } else {
                    String id_criptomoneda_tex = null;
                    for (Entry<String, Object> entry : formulario_claves_valor_lista) {
                        if (entry.getKey().equals(k_borrado_clave_id_criptomoneda)) {
                            id_criptomoneda_tex = entry.getValue().toString();
                        } else if (entry.getKey().equals(k_paginacion_clave_fila_num)) {
                            fila_inicio_pagina = Long.valueOf(entry.getValue().toString());
                        }
                    }
                    borrar_fila(id_criptomoneda_tex, ok);
                    if (ok.es == false) { break; }
                    in = ResourceBundles.getBundle(k_in_ruta);
                    error_tex = tr.in(in, "Operativa completada con éxito. ");
                    lectura_web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
                    filas_cuenta = leer_cuenta_filas_criptomonedas(ok);
                    if (ok.es == false) { return null; }
                    capturar_lecturas_web_formulario(fila_inicio_pagina, filas_cuenta, ok);
                    if (ok.es == false) { return null; }
                    texto_html = lectura_web_formulario.getContenido_formulario_html();
                }
            }
            default -> {
                escribir_linea_error(tr.in(in, "Opción no válida. "), ok, extras_array);
            }
            }
            return texto_html;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Crea el formulario de presentación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_lectura(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            lectura_control_tabla.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, String> valores_mapa = new HashMap<>();
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_control_tablas_opciones_mapa_lista, lectura_control_tabla.crear_tabla_vacia(ok, extra_array));
            if (ok.es == false) { return ok.es; }
            opciones_mapa.put(k_control_tablas_opciones_mapa_tabla_fragmento, k_opciones_mapa_nombre_fragmento_control_tablas_criptomonedas);
            opciones_mapa.put(k_control_tablas_opciones_mapa_tabla_fila_fragmento, k_opciones_mapa_nombre_fragmento_control_tablas_fila_criptomonedas);
            lectura_control_tabla.poner_en_formulario(lectura_web_formulario, k_lectura_clave_tabla, valores_mapa, tr.in(in, "Tabla de criptomonedas "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa.put(k_valores_mapa_style_submit_tex, "height:28px;margin-top:5px;margin-bottom:5px;");
            paginacion_retroceder_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_retroceder_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_retroceder
            , valores_mapa, tr.in(in,"Retroceder"), null, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_avanzar_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_avanzar_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_avanzar
            , valores_mapa, tr.in(in,"Avanzar"), null, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, "");
            paginacion_ir_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , valores_mapa, tr.in(in,"Ir a fila"), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_ir
            , valores_mapa, tr.in(in,"Ir"), null, ok);
            paginacion_crear_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa.put(k_valores_mapa_style_submit_tex, "height:28px;margin-top:5px;margin-bottom:5px;background-color:salmon;");
            paginacion_crear_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_lectura_clave_crear
            , valores_mapa, tr.in(in,"Crear"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de borrado.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_borrado(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            control_entradas borrado_fila_num_control_entrada = new control_entradas();
            control_entradas borrado_id_criptomoneda_control_entrada = new control_entradas();
            control_entradas borrado_cancelar_control_entrada = new control_redirecciones();
            control_entradas borrado_confirmar_control_entrada = new control_entradas();
            Map<String, String> valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_style_fragmento_submit_tex, "display:inline-block;padding:0px;width:50%;");
            valores_mapa.put(k_valores_mapa_style_fragmento_cancelar_tex, "display:inline-block;width:50%;");
            valores_mapa.put(k_valores_mapa_url_destino_tex
            , k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html + k_clab_criptomonedas_cancelar_html);
            borrado_cancelar_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            borrado_confirmar_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            borrado_cancelar_control_entrada.poner_en_formulario(borrado_web_formulario, k_borrado_clave_cancelar
            , valores_mapa, tr.in(in, "Cancelar"), null, ok);
            borrado_confirmar_control_entrada.poner_en_formulario(borrado_web_formulario, k_borrado_clave_enviar
            , valores_mapa, tr.in(in, "¿Está seguro? "), null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_id_criptomoneda_control_entrada.iniciar(k_entradas_tipo_hidden, ok);
            if (ok.es == false) { return ok.es; }
            borrado_id_criptomoneda_control_entrada.poner_en_formulario(borrado_web_formulario, k_borrado_clave_id_criptomoneda
            , null, null, null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_fila_num_control_entrada.iniciar(k_entradas_tipo_hidden, ok);
            if (ok.es == false) { return ok.es; }
            borrado_fila_num_control_entrada.poner_en_formulario(borrado_web_formulario, k_paginacion_clave_fila_num
            , null, null, null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de paginación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_insercion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            control_entradas insercion_id_criptomoneda_control_entrada = new control_entradas();
            control_entradas insercion_simbolo_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_de_mercado_control_entrada = new control_entradas();
            control_entradas insercion_aporte_circulante_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_total_diluida_control_entrada = new control_entradas();
            control_entradas insercion_aporte_total_control_entrada = new control_entradas();
            control_entradas insercion_aporte_maximo_control_entrada = new control_entradas();
            control_entradas insercion_dominancia_control_entrada = new control_entradas();
            control_entradas insercion_total_valor_bloqueado_control_entrada = new control_entradas();
            control_entradas insercion_id_criptomoneda_previo_control_entrada = new control_entradas();
            control_entradas insercion_fila_num_control_entrada = new control_entradas();
            control_entradas insercion_tipo_operacion_control_entrada = new control_entradas();
            control_entradas insercion_enviar_control_entrada = new control_entradas();
            control_entradas insercion_cancelar_control_entrada = new control_redirecciones();
            Map<String, String> valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_style_fragmento_submit_tex, "display:inline-block;width:50%;");
            valores_mapa.put(k_valores_mapa_style_fragmento_cancelar_tex, "display:inline-block;width:50%;");
            valores_mapa.put(k_valores_mapa_url_destino_tex
            , k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html + k_clab_criptomonedas_cancelar_html);
            String [] columnas_array = select_columnas_tex.split(",");
            String [] columnas_captura_array = select_columnas_cabecera_tex.split(",");
            insercion_id_criptomoneda_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_total_diluida_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_id_criptomoneda_previo_control_entrada.iniciar(k_entradas_tipo_hidden, ok);
            if (ok.es == false) { return ok.es; }
            insercion_fila_num_control_entrada.iniciar(k_entradas_tipo_hidden, ok);
            if (ok.es == false) { return ok.es; }
            insercion_tipo_operacion_control_entrada.iniciar(k_entradas_tipo_hidden, ok);
            if (ok.es == false) { return ok.es; }
            insercion_cancelar_control_entrada.iniciar(k_entradas_tipo_boton, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            insercion_id_criptomoneda_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[0].trim()
            , null, columnas_captura_array[0], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[1].trim()
            , null, columnas_captura_array[1], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[2].trim()
            , null, columnas_captura_array[2], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[3].trim()
            , null, columnas_captura_array[3], null, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, "");
            insercion_capitalizacion_total_diluida_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[4].trim()
            , null, columnas_captura_array[4], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[5].trim()
            , null, columnas_captura_array[5], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[6].trim()
            , null, columnas_captura_array[6], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[7].trim()
            , null, columnas_captura_array[7], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[8].trim()
            , null, columnas_captura_array[8], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_id_criptomoneda_previo_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_id_criptomoneda_previo
            , null, null, null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_fila_num_control_entrada.poner_en_formulario(insercion_web_formulario, k_paginacion_clave_fila_num
            , null, null, null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_tipo_operacion_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_tipo_operacion
            , null, null, null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_cancelar_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_cancelar
            , valores_mapa, tr.in(in, "Cancelar"), null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_enviar
            , valores_mapa, tr.in(in, "Enviar"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Lee una página a partir de una posición (0 en adelante)
     * @param inicio_pos
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean leer_pagina_criptomonedas(Long inicio_pos, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.leer_crear_lectura_columnas_lista(select_columnas_tex, ok);
            if (ok.es == false) { return false; }
            sql_comando.leer_iniciar(select, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.leer_poner_valor(inicio_pos, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.leer_poner_valor(Integer.valueOf(select_pagina_tam), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return false; }
            lecturas_lista = sql_comando.leer_lecturas_lista(ok, extra_array);
            if (ok.es == false) { return false; }
            lecturas_textos_lista = _pasar_a_texto_segun_tipo(sql_comando.leer_lecturas_lista_con_tipo_valor(ok), ok);
            if (ok.es == false) { return false; }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Long leer_cuenta_filas_criptomonedas(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return null; }
            sql_comando.leer_iniciar(select_count, ok, extra_array);
            if (ok.es == false && ok.id.equals(k_sql_comandos_marcador_columnas_lista_error) == false) {
                return null; 
            } else {
                ok.iniciar();
            }
            sql_comando.leer_crear_lectura_columnas_lista(k_columna_cuenta_tex, ok, extra_array);
            if (ok.es == false) { return null; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return null; }
            tipos_valores tipo_valor = sql_comando.lecturas_lista.get(0).get(k_columna_cuenta_tex);
            return ((BigDecimal) tipo_valor.valor).longValue();
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Crea una fila
     * @param valores_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_fila(LinkedList<Object> valores_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.crear_iniciar(insert, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.crear(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Actualiza una fila
     * @param valores_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar_fila(LinkedList<Object> valores_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_iniciar(update, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(9), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.actualizar(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Borra una fila
     * @param id_criptomoneda
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean borrar_fila(String id_criptomoneda, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.borrar_iniciar(delete, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.borrar_poner_valor(id_criptomoneda, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.borrar(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Devuelve una lista con los datos formateados, y sin la información del tipo de dato
     * @param filas_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public LinkedList<LinkedHashMap<String, Object>> _pasar_a_texto_segun_tipo(LinkedList<LinkedHashMap<String, tipos_valores>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        LinkedList<LinkedHashMap<String, Object>> retorno_lista = null;
        ResourceBundle in = null;
        try {
            String texto;
            LinkedHashMap<String, Object> retorno_columnas_mapa;
            retorno_lista = new LinkedList<>();
            for (LinkedHashMap<String, tipos_valores> columnas_mapa: filas_lista) {
                retorno_columnas_mapa = new LinkedHashMap<>();
                for (Entry<String,tipos_valores> entry: columnas_mapa.entrySet()) {
                    texto = entry.getValue().pasar_a_texto_segun_tipo(ok);
                    if (ok.es == false) { break; }
                    retorno_columnas_mapa.put(entry.getKey(), texto);
                }
                if (ok.es == false) { break; }
                retorno_lista.add(retorno_columnas_mapa);
            }
        } catch (Exception e) {
            throw e;
        }
        return retorno_lista;
    }

    public boolean _poner_cabecera(LinkedList<LinkedHashMap<String, Object>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            LinkedHashMap<String, Object> cabecera = new LinkedHashMap<>();
            String [] columnas_array;
            columnas_array = select_columnas_cabecera_tex.split(",");
            int i = 0;
            for (String columna: columnas_array) {
                columna = columna.trim();
                cabecera.put(columna, columna);
            }
            filas_lista.addFirst(cabecera); 
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    
    public String leer_seleccion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        String texto = null;
        try {
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return texto;
    }
    /**
     * 
     * @param fila_inicio_pagina
     * @param filas_cuenta
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean capturar_lecturas_web_formulario(long fila_inicio_pagina, long filas_cuenta, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            Map <String, String> valores_mapa;
            String info_tabla;
            in = ResourceBundles.getBundle(k_in_ruta);
            leer_pagina_criptomonedas(fila_inicio_pagina, ok);
            if (ok.es == false) { return false; }
            cargar_tabla(ok, extra_array);
            if (ok.es == false) { return false; }
            valores_mapa = new HashMap<>();
            info_tabla = tr.in(in, "Presentando fila ") 
            + (fila_inicio_pagina + 1) 
            + tr.in(in, " de ") + filas_cuenta;
            valores_mapa.put(k_valores_mapa_info_tabla_tex, info_tabla);
            lectura_control_tabla.modificar_valor(valores_mapa, ok, extra_array);
            if (ok.es == false) { return false; }
            paginacion_ir_control_entrada.importar_captura(fila_inicio_pagina + 1, ok, extra_array);
            if (ok.es == false) { return false; }
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html);
            lectura_web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            lectura_web_formulario.iniciar(k_fragmentos_clab_criptomonedas_ruta, null, null, ok);
            if (ok.es == false) { return ok.es; }
            lectura_web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Obtiene el código HTML de captura para la creación
     * @param id_criptomoneda
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public boolean capturar_creacion_web_formulario(String id_criptomoneda, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            LinkedHashMap<String, Object> fila_encontrada_mapa = null;
            for (LinkedHashMap<String, Object> columnas_mapa : lecturas_lista) {
                fila_encontrada_mapa = columnas_mapa;
                break;
            }
            List<Entry<String, Object>> clave_valor_lista = new LinkedList<>();
            Entry<String, Object> entry;
            int i = 0;
            int tam = fila_encontrada_mapa.size() - 1; // No se usa la última columna
            for (Entry<String, Object> columna_entry : fila_encontrada_mapa.entrySet()) {
                if (i >= tam) {
                    break;
                }
                entry = new SimpleEntry<>(columna_entry.getKey(), "");
                clave_valor_lista.add(entry);
                i = i + 1;
            }
            entry = new SimpleEntry<>(k_insercion_clave_id_criptomoneda_previo, "");
            clave_valor_lista.add(entry);
            entry = new SimpleEntry<>(k_paginacion_clave_fila_num, String.valueOf(fila_inicio_pagina));
            clave_valor_lista.add(entry);
            insercion_web_formulario.importar_valores(clave_valor_lista, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            List<Entry<String, Object>> index_claves_valor_lista = insercion_web_formulario.exportar_valores(k_paginacion_clave_fila_num, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            Entry<String, Object> clave_valor_mapa = index_claves_valor_lista.get(0);
            Map<String, String> valores_mapa = (Map<String, String>) clave_valor_mapa.getValue();
            valores_mapa.put(k_valores_mapa_valor_tex, String.valueOf(fila_inicio_pagina));
            index_claves_valor_lista = insercion_web_formulario.exportar_valores(k_insercion_clave_tipo_operacion, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            clave_valor_mapa = index_claves_valor_lista.get(0);
            valores_mapa = (Map<String, String>) clave_valor_mapa.getValue();
            valores_mapa.put(k_valores_mapa_valor_tex, k_tipo_operacion_insertar);
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html);
            insercion_web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Obtiene el código HTML de captura para la actualizacion
     * @param id_criptomoneda
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public boolean capturar_actualizacion_web_formulario(String id_criptomoneda, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            String id_criptomoneda_columna = null;
            LinkedHashMap<String, Object> fila_encontrada_mapa = null;
            for (LinkedHashMap<String, Object> columnas_mapa : lecturas_lista) {
                for (Entry<String, Object> entry : columnas_mapa.entrySet()) {
                    id_criptomoneda_columna = (String) entry.getValue();
                    break;
                }
                if (id_criptomoneda_columna.equals(id_criptomoneda)) {
                    fila_encontrada_mapa = columnas_mapa;
                    break;
                }
            }
            List<Entry<String, Object>> clave_valor_lista = new LinkedList<>();
            Entry<String, Object> entry;
            int i = 0;
            int tam = fila_encontrada_mapa.size() - 1; // No se usa la última columna
            for (Entry<String, Object> columna_entry : fila_encontrada_mapa.entrySet()) {
                if (i >= tam) {
                    break;
                }
                entry = new SimpleEntry<>(columna_entry.getKey(), columna_entry.getValue());
                clave_valor_lista.add(entry);
                i = i + 1;
            }
            entry = new SimpleEntry<>(k_insercion_clave_id_criptomoneda_previo, String.valueOf(id_criptomoneda));
            clave_valor_lista.add(entry);
            entry = new SimpleEntry<>(k_paginacion_clave_fila_num, String.valueOf(fila_inicio_pagina));
            clave_valor_lista.add(entry);
            insercion_web_formulario.importar_valores(clave_valor_lista, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            List<Entry<String,Object>> index_claves_valor_lista = insercion_web_formulario.exportar_valores(k_insercion_clave_tipo_operacion, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            Entry<String,Object> clave_valor_mapa = index_claves_valor_lista.get(0);
            Map<String, String> valores_mapa = (Map<String, String>) clave_valor_mapa.getValue();
            valores_mapa.put(k_valores_mapa_valor_tex, k_tipo_operacion_actualizar);
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html);
            insercion_web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Obtiene el código HTML de captura para la actualizacion
     * @param id_criptomoneda
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean capturar_borrado_web_formulario(String id_criptomoneda, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            String id_criptomoneda_columna = null;
            LinkedHashMap<String, Object> fila_encontrada_mapa = null;
            for (LinkedHashMap<String, Object> columnas_mapa : lecturas_lista) {
                for (Entry<String, Object> entry : columnas_mapa.entrySet()) {
                    id_criptomoneda_columna = (String) entry.getValue();
                    break;
                }
                if (id_criptomoneda_columna.equals(id_criptomoneda)) {
                    fila_encontrada_mapa = columnas_mapa;
                    break;
                }
            }
            Map<String,String> valores_mapa = new LinkedHashMap<>();
            List<Entry<String, Object>> clave_valor_lista = new LinkedList<>();
            Entry<String, Object> entry;
            for (Entry<String, Object> columna_entry : fila_encontrada_mapa.entrySet()) {
                valores_mapa.put(columna_entry.getKey(), columna_entry.getValue().toString());
            }
            entry = new SimpleEntry<>(k_paginacion_clave_fila_num, String.valueOf(fila_inicio_pagina));
            clave_valor_lista.add(entry);
            entry = new SimpleEntry<>(k_borrado_clave_id_criptomoneda, String.valueOf(id_criptomoneda));
            clave_valor_lista.add(entry);
            borrado_web_formulario.importar_valores(clave_valor_lista, ok, extra_array);
            if (ok.es == false) { return ok.es; }
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html);
            borrado_web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_web_formulario.iniciar(k_fragmentos_clab_criptomonedas_ruta, null, null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_web_formulario.setFragmento_nombre(k_borrado_web_formularios);
            borrado_web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Carga las filas con los datos
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean cargar_tabla(oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            in = ResourceBundles.getBundle(k_in_ruta);
            for (LinkedHashMap<String, Object> columnas_mapa : lecturas_textos_lista) {
                columnas_mapa.put(k_boton_actualizar_tex, tr.in(in, "Actualizar"));
                columnas_mapa.put(k_boton_borrar_tex, tr.in(in, "Borrar"));
            }
            lectura_control_tabla.cargar_tabla(lecturas_textos_lista, ok, extra_array);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }

    public boolean escribir_error(web_formularios formulario, String mensaje, oks ok, Object... extra_array) {
        if (ok.es == false) { return ok.es; }
        formulario.getValores_mapa().put(k_valores_mapa_mensaje_error_tex, mensaje);
        return ok.es;
    }
    /**
     * Procesa los datos recibidos de una petición HTTP/S Get
     * @param datos_mapa
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public String procesar_formulario(Map<String, String> datos_mapa, oks ok, Object ... extras_array) throws Exception {
        ResourceBundle in;
        String texto_html = null;
        try {
            if (ok.es == false) { return null; }
            in = ResourceBundles.getBundle(k_in_ruta);
            String operacion_tex = null;
            String clave_entry, valor_entry;
            List<Entry<String, Object>> formulario_claves_valor_lista = new LinkedList<>();
            Map.Entry<String, Object> nueva_entrada;
            String id_criptomoneda = null;
            for(Entry<String, String> entry: datos_mapa.entrySet()) {
                clave_entry = entry.getKey();
                if (clave_entry.equals(Clab_criptomonedas.k_paginacion_clave_retroceder)) {
                    operacion_tex = k_retroceder;
                } else if (clave_entry.equals(Clab_criptomonedas.k_paginacion_clave_avanzar)) {
                    operacion_tex = k_avanzar;
                } else if (clave_entry.equals(Clab_criptomonedas.k_paginacion_clave_ir)) {
                    operacion_tex = k_ir;
                } else if (clave_entry.equals(Clab_criptomonedas.k_lectura_clave_crear)) {
                    operacion_tex = k_crear;
                } else if (clave_entry.startsWith(Clab_criptomonedas.k_lectura_clave_actualizar)) {
                    id_criptomoneda = clave_entry.substring(k_lectura_clave_actualizar.length());
                    operacion_tex = k_actualizar;
                } else if (clave_entry.startsWith(Clab_criptomonedas.k_lectura_clave_borrar)) {
                    id_criptomoneda = clave_entry.substring(k_lectura_clave_borrar.length());
                    operacion_tex = k_borrar;
                } else if (clave_entry.equals(Clab_criptomonedas.k_insercion_clave_enviar)) {
                    operacion_tex = k_crear_procesar;
                } else if (clave_entry.equals(Clab_criptomonedas.k_insercion_clave_cancelar)) {
                    operacion_tex = k_ir;
                } else if (clave_entry.equals(Clab_criptomonedas.k_borrado_clave_enviar)) {
                    operacion_tex = k_borrar_procesar;
                } else if (clave_entry.equals(Clab_criptomonedas.k_borrado_clave_cancelar)) {
                    operacion_tex = k_ir;
                }
                valor_entry = entry.getValue();
                clave_entry = clave_entry.replaceAll("^\\.+\\[\\s*\\d+\\s*\\]$", "");
                nueva_entrada = new SimpleEntry<>(clave_entry, valor_entry);
                formulario_claves_valor_lista.add(nueva_entrada);
            }
            texto_html = procesar_clab_formularios(operacion_tex, id_criptomoneda, formulario_claves_valor_lista, ok);
            if (ok.es == false) { return null; }
        } catch (Exception e) {
            ok.setTxt(e);
            texto_html = null;
        }
        return texto_html;
    }

}
