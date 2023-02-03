<template>
  <Nav/>
      <v-container>
        <v-row>
        <v-col cols="5">
        <v-card color="deep-purple-lighten-4">
        <Search/>
          <Blog/>
          <Blog/>
          <Blog/>
          <Blog/>
        </v-card>
        </v-col>
        <v-col cols="auto">
          <FullBlog/>
        </v-col>
      </v-row>
      </v-container>
</template>

<script setup>
  import Nav from '@/components/Nav.vue'
  import Search from '@/components/Search.vue';
  import FullBlog from '@/components/FullBlog.vue';
  import Blog from '@/components/Blog.vue';
</script>
