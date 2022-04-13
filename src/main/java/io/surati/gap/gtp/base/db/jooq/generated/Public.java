/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.gtp.base.db.jooq.generated;


import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpAccountPec;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpAnnualWarrant;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpAnnualWarrantView;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpBundle;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpChapter;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpLine;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpRegion;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpSection;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpSubChapter;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpTitle;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpTreasury;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpTreasuryView;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpWarrant;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpWarrantView;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.gtp_account_pec</code>.
     */
    public final GtpAccountPec GTP_ACCOUNT_PEC = GtpAccountPec.GTP_ACCOUNT_PEC;

    /**
     * The table <code>public.gtp_annual_warrant</code>.
     */
    public final GtpAnnualWarrant GTP_ANNUAL_WARRANT = GtpAnnualWarrant.GTP_ANNUAL_WARRANT;

    /**
     * The table <code>public.gtp_annual_warrant_view</code>.
     */
    public final GtpAnnualWarrantView GTP_ANNUAL_WARRANT_VIEW = GtpAnnualWarrantView.GTP_ANNUAL_WARRANT_VIEW;

    /**
     * The table <code>public.gtp_bundle</code>.
     */
    public final GtpBundle GTP_BUNDLE = GtpBundle.GTP_BUNDLE;

    /**
     * The table <code>public.gtp_chapter</code>.
     */
    public final GtpChapter GTP_CHAPTER = GtpChapter.GTP_CHAPTER;

    /**
     * The table <code>public.gtp_line</code>.
     */
    public final GtpLine GTP_LINE = GtpLine.GTP_LINE;

    /**
     * The table <code>public.gtp_region</code>.
     */
    public final GtpRegion GTP_REGION = GtpRegion.GTP_REGION;

    /**
     * The table <code>public.gtp_section</code>.
     */
    public final GtpSection GTP_SECTION = GtpSection.GTP_SECTION;

    /**
     * The table <code>public.gtp_sub_chapter</code>.
     */
    public final GtpSubChapter GTP_SUB_CHAPTER = GtpSubChapter.GTP_SUB_CHAPTER;

    /**
     * The table <code>public.gtp_title</code>.
     */
    public final GtpTitle GTP_TITLE = GtpTitle.GTP_TITLE;

    /**
     * The table <code>public.gtp_treasury</code>.
     */
    public final GtpTreasury GTP_TREASURY = GtpTreasury.GTP_TREASURY;

    /**
     * The table <code>public.gtp_treasury_view</code>.
     */
    public final GtpTreasuryView GTP_TREASURY_VIEW = GtpTreasuryView.GTP_TREASURY_VIEW;

    /**
     * The table <code>public.gtp_warrant</code>.
     */
    public final GtpWarrant GTP_WARRANT = GtpWarrant.GTP_WARRANT;

    /**
     * The table <code>public.gtp_warrant_view</code>.
     */
    public final GtpWarrantView GTP_WARRANT_VIEW = GtpWarrantView.GTP_WARRANT_VIEW;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            GtpAccountPec.GTP_ACCOUNT_PEC,
            GtpAnnualWarrant.GTP_ANNUAL_WARRANT,
            GtpAnnualWarrantView.GTP_ANNUAL_WARRANT_VIEW,
            GtpBundle.GTP_BUNDLE,
            GtpChapter.GTP_CHAPTER,
            GtpLine.GTP_LINE,
            GtpRegion.GTP_REGION,
            GtpSection.GTP_SECTION,
            GtpSubChapter.GTP_SUB_CHAPTER,
            GtpTitle.GTP_TITLE,
            GtpTreasury.GTP_TREASURY,
            GtpTreasuryView.GTP_TREASURY_VIEW,
            GtpWarrant.GTP_WARRANT,
            GtpWarrantView.GTP_WARRANT_VIEW);
    }
}
