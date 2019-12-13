/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 10:21 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.oncrpc4j.rpc.OncRpcException;
import org.dcache.oncrpc4j.xdr.XdrAble;
import org.dcache.oncrpc4j.xdr.XdrDecodingStream;
import org.dcache.oncrpc4j.xdr.XdrEncodingStream;
import java.io.IOException;
import org.dcache.nfs.v4.xdr.deviceid4;
import org.dcache.nfs.v4.xdr.fattr4_owner;
import org.dcache.nfs.v4.xdr.fattr4_owner_group;
import org.dcache.nfs.v4.xdr.nfs_fh4;
import org.dcache.nfs.v4.xdr.stateid4;
import org.dcache.nfs.v4.xdr.uint32_t;

public class ff_data_server4 implements XdrAble {
    public deviceid4 ffds_deviceid;
    public uint32_t ffds_efficiency;
    public stateid4 ffds_stateid;
    public nfs_fh4[] ffds_fh_vers;
    public fattr4_owner ffds_user;
    public fattr4_owner_group ffds_group;

    public ff_data_server4() {
    }

    public ff_data_server4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        ffds_deviceid.xdrEncode(xdr);
        ffds_efficiency.xdrEncode(xdr);
        ffds_stateid.xdrEncode(xdr);
        { int $size = ffds_fh_vers.length; xdr.xdrEncodeInt($size); for ( int $idx = 0; $idx < $size; ++$idx ) { ffds_fh_vers[$idx].xdrEncode(xdr); } }
        ffds_user.xdrEncode(xdr);
        ffds_group.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        ffds_deviceid = new deviceid4(xdr);
        ffds_efficiency = new uint32_t(xdr);
        ffds_stateid = new stateid4(xdr);
        { int $size = xdr.xdrDecodeInt(); ffds_fh_vers = new nfs_fh4[$size]; for ( int $idx = 0; $idx < $size; ++$idx ) { ffds_fh_vers[$idx] = new nfs_fh4(xdr); } }
        ffds_user = new fattr4_owner(xdr);
        ffds_group = new fattr4_owner_group(xdr);
    }

}
// End of ff_data_server4.java
