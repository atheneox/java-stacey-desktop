package com.atheneox.stacey.views;

import com.atheneox.horizontefrances.views.Jif_SubModel;
import com.atheneox.horizontefrances.views.Jif_Model;
import com.atheneox.horizontefrances.views.Jif_MasterCollection;
import com.atheneox.morenos.views.Jif_ModelTires;
import com.atheneox.morenos.views.Jif_StockTires;
import com.atheneox.morenos.views.Jif_TradeMarkTires;
import com.atheneox.utils.ImagenFondo;
import com.atheneox.stacey.views.reports.Jif_R_User;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

public class Stacey extends javax.swing.JFrame {
    
    private Dimension dimension;
    public Stacey() {
                initComponents();
                jdp_Main.setOpaque(false);
                jdp_Main.setBorder(new ImagenFondo());
                
                setLocationRelativeTo(null);
                setTitle("Stacey-Desktop");
                dimension =super.getToolkit().getScreenSize();     
                setSize(dimension);          
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdp_Main = new javax.swing.JDesktopPane();
        Jlbl_copyright = new javax.swing.JLabel();
        jmb_main = new javax.swing.JMenuBar();
        menu_File = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_open = new javax.swing.JMenuItem();
        jmi_save = new javax.swing.JMenuItem();
        jmi_saveas = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        menu_Edit = new javax.swing.JMenu();
        jmi_cut = new javax.swing.JMenuItem();
        jmi_copy = new javax.swing.JMenuItem();
        jmi_paste = new javax.swing.JMenuItem();
        jmi_delete = new javax.swing.JMenuItem();
        menu_Module = new javax.swing.JMenu();
        jmi_binnacle = new javax.swing.JMenuItem();
        jmi_quotation = new javax.swing.JMenuItem();
        Jmi_client = new javax.swing.JMenuItem();
        jmi_puchase = new javax.swing.JMenuItem();
        jmi_receivable = new javax.swing.JMenuItem();
        jmi_paytobill = new javax.swing.JMenuItem();
        jmi_billing = new javax.swing.JMenuItem();
        jmi_stock = new javax.swing.JMenuItem();
        jmi_purchaseOrder = new javax.swing.JMenuItem();
        jmi_product = new javax.swing.JMenuItem();
        jmi_role = new javax.swing.JMenuItem();
        Jmi_doctype = new javax.swing.JMenuItem();
        jmi_transfer = new javax.swing.JMenuItem();
        Jmi_user = new javax.swing.JMenuItem();
        menu_Report = new javax.swing.JMenu();
        Jmi_reportClient = new javax.swing.JMenuItem();
        Jmi_reportSales = new javax.swing.JMenuItem();
        Jmi_reportQuotation = new javax.swing.JMenuItem();
        Jmi_reportPurchase = new javax.swing.JMenuItem();
        Jmi_reportPurchaseOrder = new javax.swing.JMenuItem();
        Jmi_reportProvider = new javax.swing.JMenuItem();
        Jmi_reportStock = new javax.swing.JMenuItem();
        Jmi_reportTransfer = new javax.swing.JMenuItem();
        Jmi_reportUser = new javax.swing.JMenuItem();
        menu_hFrances = new javax.swing.JMenu();
        jmi_masterCollections = new javax.swing.JMenuItem();
        jmi_models = new javax.swing.JMenuItem();
        jmi_subModels = new javax.swing.JMenuItem();
        menuMorenos = new javax.swing.JMenu();
        jmi_tires = new javax.swing.JMenuItem();
        jmi_trademark = new javax.swing.JMenuItem();
        jmi_model = new javax.swing.JMenuItem();
        menu_Preferences = new javax.swing.JMenu();
        Jmi_active = new javax.swing.JMenuItem();
        Jmi_locked = new javax.swing.JMenuItem();
        Jmi_destroyed = new javax.swing.JMenuItem();
        Jmi_visible = new javax.swing.JMenuItem();
        jmi_setup = new javax.swing.JMenuItem();
        menu_Help = new javax.swing.JMenu();
        jmi_about = new javax.swing.JMenuItem();
        jmi_content = new javax.swing.JMenuItem();
        jmi_updates = new javax.swing.JMenuItem();
        jmi_bugReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png")).getImage());
        setName("Jframe_Stacey"); // NOI18N

        jdp_Main.setName(""); // NOI18N

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlbl_copyrightMouseClicked(evt);
            }
        });

        jdp_Main.setLayer(Jlbl_copyright, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdp_MainLayout = new javax.swing.GroupLayout(jdp_Main);
        jdp_Main.setLayout(jdp_MainLayout);
        jdp_MainLayout.setHorizontalGroup(
            jdp_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdp_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdp_MainLayout.setVerticalGroup(
            jdp_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdp_MainLayout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        menu_File.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-file_submodule.png"))); // NOI18N
        menu_File.setMnemonic('f');
        menu_File.setText("Archivo");

        jmi_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-user_credentials.png"))); // NOI18N
        jmi_login.setText("Iniciar sesión");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        menu_File.add(jmi_login);

        jmi_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-opened_folder.png"))); // NOI18N
        jmi_open.setMnemonic('o');
        jmi_open.setText("Open");
        menu_File.add(jmi_open);

        jmi_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-save.png"))); // NOI18N
        jmi_save.setMnemonic('s');
        jmi_save.setText("Save");
        menu_File.add(jmi_save);

        jmi_saveas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-save_as.png"))); // NOI18N
        jmi_saveas.setMnemonic('a');
        jmi_saveas.setText("Save As ...");
        jmi_saveas.setDisplayedMnemonicIndex(5);
        menu_File.add(jmi_saveas);

        jmi_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-exit.png"))); // NOI18N
        jmi_logout.setText("Cerrar Sesión");
        jmi_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_logoutActionPerformed(evt);
            }
        });
        menu_File.add(jmi_logout);

        jmb_main.add(menu_File);

        menu_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-edit.png"))); // NOI18N
        menu_Edit.setMnemonic('e');
        menu_Edit.setText("Editar");

        jmi_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-cut.png"))); // NOI18N
        jmi_cut.setMnemonic('t');
        jmi_cut.setText("Cortar");
        menu_Edit.add(jmi_cut);

        jmi_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-copy.png"))); // NOI18N
        jmi_copy.setMnemonic('y');
        jmi_copy.setText("Copiar");
        menu_Edit.add(jmi_copy);

        jmi_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-paste.png"))); // NOI18N
        jmi_paste.setMnemonic('p');
        jmi_paste.setText("Pegar");
        menu_Edit.add(jmi_paste);

        jmi_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-trash.png"))); // NOI18N
        jmi_delete.setMnemonic('d');
        jmi_delete.setText("Eliminar");
        menu_Edit.add(jmi_delete);

        jmb_main.add(menu_Edit);

        menu_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-module.png"))); // NOI18N
        menu_Module.setText("Módulos");

        jmi_binnacle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-spy.png"))); // NOI18N
        jmi_binnacle.setText("Bitácora");
        jmi_binnacle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_binnacleActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_binnacle);

        jmi_quotation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-quote.png"))); // NOI18N
        jmi_quotation.setText("Cotización");
        jmi_quotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_quotationActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_quotation);

        Jmi_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-gender_neutral_user.png"))); // NOI18N
        Jmi_client.setText("Clientes");
        Jmi_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_clientActionPerformed(evt);
            }
        });
        menu_Module.add(Jmi_client);

        jmi_puchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-buy.png"))); // NOI18N
        jmi_puchase.setText("Compras");
        jmi_puchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_puchaseActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_puchase);

        jmi_receivable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-bill.png"))); // NOI18N
        jmi_receivable.setText("Cuentas por cobrar");
        jmi_receivable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_receivableActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_receivable);

        jmi_paytobill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-bill.png"))); // NOI18N
        jmi_paytobill.setText("Cuentas por pagar");
        jmi_paytobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_paytobillActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_paytobill);

        jmi_billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-invoice.png"))); // NOI18N
        jmi_billing.setText("Facturación");
        jmi_billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_billingActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_billing);

        jmi_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-stocks.png"))); // NOI18N
        jmi_stock.setText("Inventario");
        jmi_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_stockActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_stock);

        jmi_purchaseOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-purchase_order.png"))); // NOI18N
        jmi_purchaseOrder.setText("Orden de compra");
        menu_Module.add(jmi_purchaseOrder);

        jmi_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-product.png"))); // NOI18N
        jmi_product.setText("Producto");
        jmi_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_productActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_product);

        jmi_role.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-theatre_mask.png"))); // NOI18N
        jmi_role.setText("Roles");
        jmi_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_roleActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_role);

        Jmi_doctype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-documents.png"))); // NOI18N
        Jmi_doctype.setText("Tipo Doc");
        Jmi_doctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_doctypeActionPerformed(evt);
            }
        });
        menu_Module.add(Jmi_doctype);

        jmi_transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-data_in_both_directions.png"))); // NOI18N
        jmi_transfer.setText("Transferencia");
        jmi_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_transferActionPerformed(evt);
            }
        });
        menu_Module.add(jmi_transfer);

        Jmi_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-user.png"))); // NOI18N
        Jmi_user.setText("Usuarios");
        Jmi_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_userActionPerformed(evt);
            }
        });
        menu_Module.add(Jmi_user);

        jmb_main.add(menu_Module);

        menu_Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-news.png"))); // NOI18N
        menu_Report.setText("Reportes");

        Jmi_reportClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportClient.setText("R. Clientes");
        Jmi_reportClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportClientActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportClient);

        Jmi_reportSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportSales.setText("R. Ventas");
        Jmi_reportSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportSalesActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportSales);

        Jmi_reportQuotation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportQuotation.setText("R. Cotización");
        menu_Report.add(Jmi_reportQuotation);

        Jmi_reportPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportPurchase.setText("R. Compras");
        Jmi_reportPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportPurchaseActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportPurchase);

        Jmi_reportPurchaseOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportPurchaseOrder.setText("R. O/Compras");
        Jmi_reportPurchaseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportPurchaseOrderActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportPurchaseOrder);

        Jmi_reportProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportProvider.setText("R. Proovedores");
        Jmi_reportProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportProviderActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportProvider);

        Jmi_reportStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportStock.setText("R. Inventario");
        Jmi_reportStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportStockActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportStock);

        Jmi_reportTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportTransfer.setText("R. Transferencia");
        menu_Report.add(Jmi_reportTransfer);

        Jmi_reportUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-news.png"))); // NOI18N
        Jmi_reportUser.setText("R. Usuario");
        Jmi_reportUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_reportUserActionPerformed(evt);
            }
        });
        menu_Report.add(Jmi_reportUser);

        jmb_main.add(menu_Report);

        menu_hFrances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-france.png"))); // NOI18N
        menu_hFrances.setText("H Frances");
        menu_hFrances.setEnabled(false);

        jmi_masterCollections.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-collectibles_filled.png"))); // NOI18N
        jmi_masterCollections.setText("Colecciones");
        jmi_masterCollections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_masterCollectionsActionPerformed(evt);
            }
        });
        menu_hFrances.add(jmi_masterCollections);

        jmi_models.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-animation_rig.png"))); // NOI18N
        jmi_models.setText("Modelos");
        jmi_models.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modelsActionPerformed(evt);
            }
        });
        menu_hFrances.add(jmi_models);

        jmi_subModels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-animation_rig.png"))); // NOI18N
        jmi_subModels.setText("Submodelos");
        jmi_subModels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_subModelsActionPerformed(evt);
            }
        });
        menu_hFrances.add(jmi_subModels);

        jmb_main.add(menu_hFrances);

        menuMorenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-tire.png"))); // NOI18N
        menuMorenos.setText("Morenos");
        menuMorenos.setEnabled(false);

        jmi_tires.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-stocks.png"))); // NOI18N
        jmi_tires.setText("Inventario de llantas");
        jmi_tires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tiresActionPerformed(evt);
            }
        });
        menuMorenos.add(jmi_tires);

        jmi_trademark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-trademark.png"))); // NOI18N
        jmi_trademark.setText("Marcas");
        jmi_trademark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_trademarkActionPerformed(evt);
            }
        });
        menuMorenos.add(jmi_trademark);

        jmi_model.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-animation_rig.png"))); // NOI18N
        jmi_model.setText("Modelos");
        jmi_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modelActionPerformed(evt);
            }
        });
        menuMorenos.add(jmi_model);

        jmb_main.add(menuMorenos);

        menu_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-settings3.png"))); // NOI18N
        menu_Preferences.setText("Preferencias");

        Jmi_active.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-ok.png"))); // NOI18N
        Jmi_active.setText("Est. Activo");
        Jmi_active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_activeActionPerformed(evt);
            }
        });
        menu_Preferences.add(Jmi_active);

        Jmi_locked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-lock_landscape.png"))); // NOI18N
        Jmi_locked.setText("Est. Bloqueado");
        Jmi_locked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_lockedActionPerformed(evt);
            }
        });
        menu_Preferences.add(Jmi_locked);

        Jmi_destroyed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-cancel.png"))); // NOI18N
        Jmi_destroyed.setText("Est. Eliminado");
        Jmi_destroyed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_destroyedActionPerformed(evt);
            }
        });
        menu_Preferences.add(Jmi_destroyed);

        Jmi_visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-visible.png"))); // NOI18N
        Jmi_visible.setText("Est. Visible");
        Jmi_visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_visibleActionPerformed(evt);
            }
        });
        menu_Preferences.add(Jmi_visible);

        jmi_setup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-database.png"))); // NOI18N
        jmi_setup.setText("Base de datos");
        jmi_setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_setupActionPerformed(evt);
            }
        });
        menu_Preferences.add(jmi_setup);

        jmb_main.add(menu_Preferences);

        menu_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/menu/icons8-help.png"))); // NOI18N
        menu_Help.setMnemonic('h');
        menu_Help.setText("Ayuda");

        jmi_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-info.png"))); // NOI18N
        jmi_about.setMnemonic('a');
        jmi_about.setText("Acerca de");
        jmi_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_aboutActionPerformed(evt);
            }
        });
        menu_Help.add(jmi_about);

        jmi_content.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-content.png"))); // NOI18N
        jmi_content.setMnemonic('c');
        jmi_content.setText("Contenido");
        menu_Help.add(jmi_content);

        jmi_updates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-available_updates.png"))); // NOI18N
        jmi_updates.setText("Actualizaciones");
        jmi_updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_updatesActionPerformed(evt);
            }
        });
        menu_Help.add(jmi_updates);

        jmi_bugReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/submenu/icons8-bug.png"))); // NOI18N
        jmi_bugReport.setText("Reportar Bug");
        jmi_bugReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_bugReportActionPerformed(evt);
            }
        });
        menu_Help.add(jmi_bugReport);

        jmb_main.add(menu_Help);

        setJMenuBar(jmb_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdp_Main)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdp_Main)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        Jif_Login jif_login = new Jif_Login();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_login.getSize();
        jif_login.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_login);
        jif_login.show(); 
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void jmi_setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_setupActionPerformed
        Jif_Setup jif_setup = new Jif_Setup();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_setup.getSize();
        jif_setup.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_setup);
        jif_setup.show(); 
    }//GEN-LAST:event_jmi_setupActionPerformed

    private void jmi_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_aboutActionPerformed
        Jif_About jif_about = new Jif_About();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_about.getSize();
        jif_about.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_about);
        jif_about.show(); 
    }//GEN-LAST:event_jmi_aboutActionPerformed

    private void Jmi_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_clientActionPerformed
       
        Jif_Client jif_client = new Jif_Client();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_client.getSize();
        jif_client.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_client);
        jif_client.show(); 
    }//GEN-LAST:event_Jmi_clientActionPerformed

    private void jmi_masterCollectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_masterCollectionsActionPerformed
            Jif_MasterCollection jif_masterCollections = new Jif_MasterCollection();
            Dimension desktopSize = jdp_Main.getSize();
            Dimension jInternalFrameSize = jif_masterCollections.getSize();
            jif_masterCollections.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                                 (desktopSize.height - jInternalFrameSize.height)/2);
            jif_masterCollections.setResizable(true);
            jif_masterCollections.setClosable(true);
            jif_masterCollections.setMaximizable(true);
            jdp_Main.add(jif_masterCollections);
            jif_masterCollections.show(); 
    }//GEN-LAST:event_jmi_masterCollectionsActionPerformed

    private void jmi_modelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modelsActionPerformed
        Jif_Model jif_model = new Jif_Model();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_model.getSize();
        jif_model.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_model);
        jif_model.show(); 
        
    }//GEN-LAST:event_jmi_modelsActionPerformed

    private void jmi_subModelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_subModelsActionPerformed
        Jif_SubModel jif_submodel = new Jif_SubModel();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_submodel.getSize();
        jif_submodel.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_submodel);
        jif_submodel.show(); 
    }//GEN-LAST:event_jmi_subModelsActionPerformed

    private void jmi_quotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_quotationActionPerformed
       Jif_Quotation jif_Quotation = new Jif_Quotation();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Quotation.getSize();
        jif_Quotation.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Quotation);
        jif_Quotation.show(); 
    }//GEN-LAST:event_jmi_quotationActionPerformed

    private void jmi_billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_billingActionPerformed
        Jif_Billing jif_Billing = new Jif_Billing();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Billing.getSize();
        jif_Billing.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Billing);
        jif_Billing.show(); 
    }//GEN-LAST:event_jmi_billingActionPerformed

    private void jmi_puchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_puchaseActionPerformed
//        Jif_Purchase jif_Purchase = new Jif_Purchase();
//        Dimension desktopSize = jdp_Main.getSize();
//        Dimension jInternalFrameSize = jif_Purchase.getSize();
//        jif_Purchase.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//                             (desktopSize.height - jInternalFrameSize.height)/2);
//        jdp_Main.add(jif_Purchase);
//        jif_Purchase.show(); 


        Jif_PurchaseOrder jif_PurchaseOrder = new Jif_PurchaseOrder();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_PurchaseOrder.getSize();
        jif_PurchaseOrder.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_PurchaseOrder);
        jif_PurchaseOrder.show(); 
    }//GEN-LAST:event_jmi_puchaseActionPerformed

    private void jmi_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_stockActionPerformed
        Jif_Stock jif_Stock = new Jif_Stock();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Stock.getSize();
        jif_Stock.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Stock);
        jif_Stock.show(); 
    }//GEN-LAST:event_jmi_stockActionPerformed

    private void jmi_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_productActionPerformed
        Jif_Product jif_Product = new Jif_Product();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Product.getSize();
        jif_Product.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Product);
        jif_Product.show(); 
    }//GEN-LAST:event_jmi_productActionPerformed

    private void jmi_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_transferActionPerformed
        Jif_Transfer jif_Transfer = new Jif_Transfer();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Transfer.getSize();
        jif_Transfer.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Transfer);
        jif_Transfer.show(); 
    }//GEN-LAST:event_jmi_transferActionPerformed

    private void jmi_receivableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_receivableActionPerformed
        Jif_Receivable jif_Receivable = new Jif_Receivable();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Receivable.getSize();
        jif_Receivable.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Receivable);
        jif_Receivable.show(); 
    }//GEN-LAST:event_jmi_receivableActionPerformed

    private void jmi_paytobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_paytobillActionPerformed
        Jif_PayToBill jif_PayToBill = new Jif_PayToBill();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_PayToBill.getSize();
        jif_PayToBill.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_PayToBill);
        jif_PayToBill.show(); 
    }//GEN-LAST:event_jmi_paytobillActionPerformed

    private void jmi_binnacleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_binnacleActionPerformed
        Jif_Binnacle jif_Binnacle = new Jif_Binnacle();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Binnacle.getSize();
        jif_Binnacle.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Binnacle);
        jif_Binnacle.show(); 
    }//GEN-LAST:event_jmi_binnacleActionPerformed

    private void Jlbl_copyrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlbl_copyrightMouseClicked
//        if(Utils.Internet())    {
//                if(Utils.validateLicense()){
                    Jif_SettingPanel jif_SettingPanel = new Jif_SettingPanel();
                    Dimension desktopSize = jdp_Main.getSize();
                    Dimension jInternalFrameSize = jif_SettingPanel.getSize();
                    jif_SettingPanel.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                                         (desktopSize.height - jInternalFrameSize.height)/2);
                    jdp_Main.add(jif_SettingPanel);
                    jif_SettingPanel.show();
//                }
//                else{
//                    JOptionPane.showConfirmDialog(null,"Licensia de producto a expirado","Stacey",JOptionPane.PLAIN_MESSAGE);
//                }   
//        }else{
//            JOptionPane.showMessageDialog(null, "No tiene conexion a internet","Stacey",JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_Jlbl_copyrightMouseClicked

    private void jmi_updatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_updatesActionPerformed
        Jif_Updates jif_Updates = new Jif_Updates();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Updates.getSize();
        jif_Updates.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Updates);
        jif_Updates.show();
    }//GEN-LAST:event_jmi_updatesActionPerformed

    private void jmi_tiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tiresActionPerformed
        Jif_StockTires jif_StockTires = new Jif_StockTires();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_StockTires.getSize();
        jif_StockTires.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_StockTires);
        jif_StockTires.show();
    }//GEN-LAST:event_jmi_tiresActionPerformed

    private void jmi_trademarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_trademarkActionPerformed
        Jif_TradeMarkTires jif_TrademarkTires = new Jif_TradeMarkTires();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_TrademarkTires.getSize();
        jif_TrademarkTires.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_TrademarkTires);
        jif_TrademarkTires.show();
    }//GEN-LAST:event_jmi_trademarkActionPerformed

    private void jmi_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modelActionPerformed
        Jif_ModelTires jif_ModelTires = new Jif_ModelTires();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_ModelTires.getSize();
        jif_ModelTires.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_ModelTires);
        jif_ModelTires.show();
    }//GEN-LAST:event_jmi_modelActionPerformed

    private void Jmi_reportPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportPurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportPurchaseActionPerformed

    private void Jmi_reportSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportSalesActionPerformed

    private void Jmi_reportPurchaseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportPurchaseOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportPurchaseOrderActionPerformed

    private void Jmi_reportClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportClientActionPerformed

    private void Jmi_reportProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportProviderActionPerformed

    private void Jmi_reportStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_reportStockActionPerformed

    private void Jmi_reportUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_reportUserActionPerformed
        try {
            Jif_R_User jif_R_User  = new Jif_R_User();
            Dimension desktopSize = jdp_Main.getSize();
            Dimension jInternalFrameSize = jif_R_User.getSize();
            jif_R_User.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                    (desktopSize.height - jInternalFrameSize.height)/2);
            jdp_Main.add(jif_R_User);
            jif_R_User.show();
        } catch (JRException ex) {
            Logger.getLogger(Stacey.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_Jmi_reportUserActionPerformed

    private void jmi_bugReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_bugReportActionPerformed
        Jif_BugReport jif_BugReport  = new Jif_BugReport();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_BugReport.getSize();
        jif_BugReport.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_BugReport);
        jif_BugReport.show();
    }//GEN-LAST:event_jmi_bugReportActionPerformed

    private void Jmi_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_userActionPerformed
        Jif_User jif_User  = new Jif_User();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_User.getSize();
        jif_User.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_User);
        jif_User.show();
    }//GEN-LAST:event_Jmi_userActionPerformed

    private void Jmi_visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_visibleActionPerformed
        Jif_StatusVisible jif_StatusVisible  = new Jif_StatusVisible();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_StatusVisible.getSize();
        jif_StatusVisible.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_StatusVisible);
        jif_StatusVisible.show();
    }//GEN-LAST:event_Jmi_visibleActionPerformed

    private void Jmi_lockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_lockedActionPerformed
        Jif_StatusLocked jif_StatusLocked  = new Jif_StatusLocked();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_StatusLocked.getSize();
        jif_StatusLocked.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_StatusLocked);
        jif_StatusLocked.show();
    }//GEN-LAST:event_Jmi_lockedActionPerformed

    private void Jmi_activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_activeActionPerformed
        Jif_StatusActive jif_StatusActive  = new Jif_StatusActive();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_StatusActive.getSize();
        jif_StatusActive.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_StatusActive);
        jif_StatusActive.show();
    }//GEN-LAST:event_Jmi_activeActionPerformed

    private void Jmi_destroyedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_destroyedActionPerformed
        Jif_StatusDestroyed jif_StatusDestroyed  = new Jif_StatusDestroyed();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_StatusDestroyed.getSize();
        jif_StatusDestroyed.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_StatusDestroyed);
        jif_StatusDestroyed.show();
    }//GEN-LAST:event_Jmi_destroyedActionPerformed

    private void jmi_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_roleActionPerformed
        Jif_Rol jif_Rol  = new Jif_Rol();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Rol.getSize();
        jif_Rol.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(jif_Rol);
        jif_Rol.show();
    }//GEN-LAST:event_jmi_roleActionPerformed

    private void Jmi_doctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_doctypeActionPerformed
        Jif_DocType docType  = new Jif_DocType();
        Dimension desktopSize = jdp_Main.getSize();
        Dimension jInternalFrameSize = docType.getSize();
        docType.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jdp_Main.add(docType);
        docType.show();
    }//GEN-LAST:event_Jmi_doctypeActionPerformed

    private void jmi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_logoutActionPerformed
        //System.exit(0);
        int valor  = JOptionPane.showConfirmDialog(this,"Seguro que desea salir","Advertencia",JOptionPane.INFORMATION_MESSAGE);
        switch (valor) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showConfirmDialog(this,"Gracias por su visita, vuelta pronto!!!","Gracias",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
            case JOptionPane.CANCEL_OPTION:
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jmi_logoutActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stacey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stacey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stacey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stacey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stacey().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JMenuItem Jmi_active;
    private javax.swing.JMenuItem Jmi_client;
    private javax.swing.JMenuItem Jmi_destroyed;
    private javax.swing.JMenuItem Jmi_doctype;
    private javax.swing.JMenuItem Jmi_locked;
    private javax.swing.JMenuItem Jmi_reportClient;
    private javax.swing.JMenuItem Jmi_reportProvider;
    private javax.swing.JMenuItem Jmi_reportPurchase;
    private javax.swing.JMenuItem Jmi_reportPurchaseOrder;
    private javax.swing.JMenuItem Jmi_reportQuotation;
    private javax.swing.JMenuItem Jmi_reportSales;
    private javax.swing.JMenuItem Jmi_reportStock;
    private javax.swing.JMenuItem Jmi_reportTransfer;
    private javax.swing.JMenuItem Jmi_reportUser;
    private javax.swing.JMenuItem Jmi_user;
    private javax.swing.JMenuItem Jmi_visible;
    public static javax.swing.JDesktopPane jdp_Main;
    private javax.swing.JMenuBar jmb_main;
    private javax.swing.JMenuItem jmi_about;
    private javax.swing.JMenuItem jmi_billing;
    private javax.swing.JMenuItem jmi_binnacle;
    private javax.swing.JMenuItem jmi_bugReport;
    private javax.swing.JMenuItem jmi_content;
    private javax.swing.JMenuItem jmi_copy;
    private javax.swing.JMenuItem jmi_cut;
    private javax.swing.JMenuItem jmi_delete;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_masterCollections;
    private javax.swing.JMenuItem jmi_model;
    private javax.swing.JMenuItem jmi_models;
    private javax.swing.JMenuItem jmi_open;
    private javax.swing.JMenuItem jmi_paste;
    private javax.swing.JMenuItem jmi_paytobill;
    private javax.swing.JMenuItem jmi_product;
    private javax.swing.JMenuItem jmi_puchase;
    private javax.swing.JMenuItem jmi_purchaseOrder;
    private javax.swing.JMenuItem jmi_quotation;
    private javax.swing.JMenuItem jmi_receivable;
    private javax.swing.JMenuItem jmi_role;
    private javax.swing.JMenuItem jmi_save;
    private javax.swing.JMenuItem jmi_saveas;
    private javax.swing.JMenuItem jmi_setup;
    private javax.swing.JMenuItem jmi_stock;
    private javax.swing.JMenuItem jmi_subModels;
    private javax.swing.JMenuItem jmi_tires;
    private javax.swing.JMenuItem jmi_trademark;
    private javax.swing.JMenuItem jmi_transfer;
    private javax.swing.JMenuItem jmi_updates;
    private javax.swing.JMenu menuMorenos;
    private javax.swing.JMenu menu_Edit;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_Help;
    private javax.swing.JMenu menu_Module;
    private javax.swing.JMenu menu_Preferences;
    private javax.swing.JMenu menu_Report;
    private javax.swing.JMenu menu_hFrances;
    // End of variables declaration//GEN-END:variables
}
