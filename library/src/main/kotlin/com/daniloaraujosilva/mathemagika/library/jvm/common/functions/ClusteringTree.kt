package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ClusteringTree
 *
 * Full name:        System`ClusteringTree
 *
 *                   ClusteringTree[{e , e , …}] constructs a weighted tree from the hierarchical clustering of the elements e , e , ….
 *                                    1   2                                                                                   1   2
 *                   ClusteringTree[{e   v , e   v , …}] represents e  with v  in the constructed graph.
 *                                    1    1   2    2                  i       i
 *                   ClusteringTree[{e , e , …}  {v , v , …}] represents e  with v  in the constructed graph.
 *                                    1   2         1   2                  i       i
 *                   ClusteringTree[ label   e , label   e   ] represents e  using labels label  in the constructed graph.
 *                                         1    1       2    2…                i                   i
 * Usage:            ClusteringTree[data, h] constructs a weighted tree from the hierarchical clustering of data by joining subclusters at distance less than h.
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> {}
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ClusterDissimilarityFunction -> Single
 *                   ContentSelectable -> Automatic
 *                   DataDissimilarityMatrix -> Automatic
 *                   DirectedEdges -> Automatic
 *                   DistanceCombiner -> Automatic
 *                   DistanceFunction -> Automatic
 *                   EdgeCapacity -> Automatic
 *                   EdgeCost -> Automatic
 *                   EdgeLabels -> None
 *                   EdgeLabelStyle -> Automatic
 *                   EdgeShapeFunction -> Automatic
 *                   EdgeStyle -> GrayLevel[0.65]
 *                   EdgeWeight -> Automatic
 *                   Editable -> False
 *                   Epilog -> {}
 *                   FeatureExtractor -> Automatic
 *                   FormatType -> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GraphHighlight -> {}
 *                   GraphHighlightStyle -> Automatic
 *                   GraphLayout -> {LayeredEmbedding, RootVertex -> 1, Orientation -> Top}
 *                   GraphRoot -> Automatic
 *                   GraphStyle -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   PerformanceGoal -> Speed
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VertexCapacity -> Automatic
 *                   VertexCoordinates -> Automatic
 *                   VertexLabels -> None
 *                   VertexLabelStyle -> Automatic
 *                   VertexShape -> Automatic
 *                   VertexShapeFunction -> Automatic
 *                   VertexSize -> 0
 *                   VertexStyle -> Automatic
 * Options:          VertexWeight -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ClusteringTree
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClusteringTree.html
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
fun clusteringTree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClusteringTree", arguments.toMutableList(), options)
}
