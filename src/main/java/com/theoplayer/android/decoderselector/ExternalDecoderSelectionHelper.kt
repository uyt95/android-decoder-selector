package com.theoplayer.android.decoderselector

import android.media.MediaCodecInfo
import android.os.Build
import com.theoplayer.android.api.settings.DecoderSelectionHelper
import com.theoplayer.android.api.settings.DecoderType

class ExternalDecoderSelectionHelper : DecoderSelectionHelper() {
    override fun shouldUseDecoder(
        decoderType: DecoderType?,
        decoderName: String?,
        codecInfo: MediaCodecInfo?
    ): Boolean {

        // Xiaomi Mi A1
        if ("OMX.qcom.video.decoder.avc" == decoderName && "tissot" == Build.PRODUCT){
            return false
        }

        return super.shouldUseDecoder(decoderType, decoderName, codecInfo)
    }
}