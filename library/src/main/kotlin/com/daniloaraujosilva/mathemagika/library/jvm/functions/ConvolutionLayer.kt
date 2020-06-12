package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConvolutionLayer
 *
 * Full name:        System`ConvolutionLayer
 *
 *                   ConvolutionLayer[n, s] represents a trainable convolutional net layer having n output channels and using kernels of size s to compute the convolution.
 *                   ConvolutionLayer[n, {s}] represents a layer performing one-dimensional convolutions with kernels of size s.
 *                   ConvolutionLayer[n, {h, w}] represents a layer performing two-dimensional convolutions with kernels of size h × w.
 *                   ConvolutionLayer[n, {h, w, d}] represents a three-dimensional convolutions with kernels of size h × w × d.
 * Usage:            ConvolutionLayer[n, kernel, opts] includes options for padding and other parameters.
 *
 *                   Biases -> Automatic
 *                   ChannelGroups -> 1
 *                   Dilation -> 1
 *                   Input -> Automatic
 *                   Interleaving -> False
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 *                   PaddingSize -> 0
 *                   Stride -> 1
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConvolutionLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConvolutionLayer.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun convolutionLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConvolutionLayer", arguments.toMutableList(), options)
}
