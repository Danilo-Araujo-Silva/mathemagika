package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dendrogram
 *
 * Full name:        System`Dendrogram
 *
 *                   Dendrogram[{e , e , …}] constructs a dendrogram from the hierarchical clustering of the elements e , e , ….
 *                                1   2                                                                                1   2
 *                   Dendrogram[{e   v , e   v , …}] represents e  with v  in the constructed dendrogram.
 *                                1    1   2    2                  i       i
 *                   Dendrogram[{e , e , …}  {v , v , …}] represents e  with v  in the constructed dendrogram.
 *                                1   2         1   2                  i       i
 *                   Dendrogram[ label   e , label   e , … ] represents e  using labels label  in the constructed dendrogram.
 *                                     1    1       2    2                   i                   i
 *                   Dendrogram[data, orientation] constructs an oriented dendrogram according to orientation.
 * Usage:            Dendrogram[tree] constructs the dendrogram corresponding to weighted tree tree.
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ClusterDissimilarityFunction -> Single
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataDissimilarityMatrix -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   DistanceCombiner -> Automatic
 *                   DistanceFunction -> Automatic
 *                   Epilog -> {}
 *                   FeatureExtractor -> Automatic
 *                   FormatType :> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dendrogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dendrogram.html
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
fun dendrogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dendrogram", arguments.toMutableList(), options)
}
